class Articoli {
    constructor(s) {
        var temp;
        this.Articoli;
        for (let i = 0; s != ""; i++) {
            if (s.at(i) != "&")
                temp += s.at(i);
        }
    }
}