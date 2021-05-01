/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.sql.Time;
import java.text.DateFormat;

/**
 *
 * @author Payd3r
 */
public class Prodotto {

    String nome; //pasta
    int quantita; //100 g
    int[] valoreEnergetico; //[82,9% carboidrati, 13,7% proteine, 3,4% grassi]
    Time scedenza; //https://docs.oracle.com/javase/7/docs/api/java/sql/Time.html

    public Prodotto() {
        this.nome = " ";
        this.quantita = 0;
        this.valoreEnergetico = new int[]{0, 0, 0};
        this.scedenza = new Time(0, 0, 0);
    }

    public Prodotto(String nome, int quantita, int[] valoreEnergetico, Time scedenza) {
        this.nome = nome;
        this.quantita = quantita;
        this.valoreEnergetico = valoreEnergetico;
        this.scedenza = scedenza;
    }

}
