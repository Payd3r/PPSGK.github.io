class Ricetta {
    constructor() {
        this.nome = "";
        this.preparazione = "";
        this.tempo = 0;
        this.calorie = 0;
        this.proteine = 0;
        this.grassi = 0;
        this.articoli;
    }
    setRicetta(s) {
        this.nome = s[0];
        this.preparazione = s[1];
        this.tempo = s[2];
        this.calorie = s[3];
        this.proteine = s[4];
        this.grassi = s[5];
        this.articoli = new Articoli(s[6]);
    }
}