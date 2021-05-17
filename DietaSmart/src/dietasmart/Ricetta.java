/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

/**
 *
 * @author Payd3r
 */
public class Ricetta {

    String nome;

    String preparazione;
    String tempo;
    int[] valoreEnergetico;//[82,9% carboidrati, 13,7% proteine, 3,4% grassi]
    String necessario;

    Ricetta() {
        this.nome = "";
        this.preparazione = "";
        this.tempo = "";
        this.valoreEnergetico = new int[]{0, 0, 0};
        this.necessario = "";
    }

    Ricetta(String nome, String preparazione, String tempo, String calorie, String proteine, String grassi, String necessario) {
        this.nome = nome;
        this.preparazione = preparazione;
        this.tempo = tempo;
        this.valoreEnergetico = new int[]{Integer.parseInt(calorie), Integer.parseInt(proteine), Integer.parseInt(grassi)};
        this.necessario = necessario;
    }
}
