'use strict';

const ftp = require('basic-ftp');
const fs = require('fs');

class FTPClient {
    constructor(host = '127.0.0.1', port = 21, secure = false) {
        this.client = new ftp.Client();
        this.settings = {
            host: host,
            port: port,
            secure: secure
        };
    }

    upload(sourcePath, remotePath, permissions) {
        let self = this;
        (async () => {
            try {
                let access = await self.client.access(self.settings);
                let upload = await self.client.upload(fs.createReadStream(sourcePath), remotePath);
                let permissions = await self.changePermissions(permissions.toString(), remotePath);
            } catch (err) {
                console.log(err);
            }
            self.client.close();
        })();
    }

    close() {
        this.client.close();
    }

    changePermissions(perms, filepath) {
        let cmd = 'SITE CHMOD ' + perms + ' ' + filepath;
        return this.client.send(cmd, false);
    }
}

module.exports = FTPClient;