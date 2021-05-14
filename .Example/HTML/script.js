var p = new ActiveXObject("Scripting.FileSystemObject");
var fileName = "C:\\Users\\Payd3r\\Desktop\\prova.txt";
p.CreateTextFile(fileName);

function Write() {
    var file = p.GetFile(fileName);
    var streamWrite = file.OpenAsTextStream(2);
    let testo = document.getElementById("testoScrivere").value;
    streamWrite.WriteLine(testo);
    streamWrite.Close();
    document.getElementById("ris").innerText = "Testo salvato";
    document.getElementById("testoScrivere").innerText = "";
}
function Append() {
    var file = p.GetFile(fileName);
    var streamAppend = file.OpenAsTextStream(8);
    let testo = document.getElementById("testoAppend").value;
    streamAppend.WriteLine(testo);
    streamAppend.Close();
    document.getElementById("ris").innerText = "Testo aggiunto";
    document.getElementById("testoAppend").innerText = "";
}
function Read() {
    var file = p.GetFile(fileName);
    var streamReader = file.OpenAsTextStream(1);

    var line = "";
    var res = "";
    while (!streamReader.AtEndOfStream) {
        line = streamReader.ReadLine();
        res += line + "\n";
    }
    document.getElementById("testoLetto").innerText = res;
}