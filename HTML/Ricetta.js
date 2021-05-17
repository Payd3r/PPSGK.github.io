class Ricetta {
    constructor(s) {
        s = s.split(";");
        this.nome = s[0];
        this.preparazione = s[1];
        this.tempo = s[2];
        this.calorie = s[3];
        this.proteine = s[4];
        this.grassi = s[5];
        this.articoli = getArticoli(s[6]);
    }
    getArticoli(s) {
        var temp = s.split("&");
        var vett;
        for (let i = 0; temp.length; i++) {
            vett += new Articolo(temp[i]);
        }
        return vett;
    }
}
//nome;preparazione;tempo;calorie;proteine;grassi;articoli;img \n
//Bistecca;Cucinare la bistecca in padella con del burro;10;1000;313;69;bistecca:45,25,30:5/06/2021&burro:10,0,90:10/12/2022