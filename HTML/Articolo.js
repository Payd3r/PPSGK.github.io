class Articolo {
    constructor(s) {
        this.nome = s.split(":")[0];
        this.valoreEnergetico = s[1].split(",");
        this.tempo = new Date(s[2].split("/")[0], s[2].split("/")[1], s[2].split("/")[3]);
    }
}

//pasta:40,20,40:10/10/2021
//nome;valoreEnergetico;scadenza
