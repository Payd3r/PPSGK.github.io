/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.sql.Time;

/**
 *
 * @author Payd3r
 */
public class Prodotto {

    public String nome; //pasta
    int[] valoreEnergetico; //[82,9% carboidrati, 13,7% proteine, 3,4% grassi]
    Time scedenza; //https://docs.oracle.com/javase/7/docs/api/java/sql/Time.html

    public Prodotto() {
        this.nome = " ";
        this.valoreEnergetico = new int[]{0, 0, 0};
        this.scedenza = new Time(0, 0, 0);
    }

    public Prodotto(String nome, int[] valoreEnergetico, Time scedenza) {
        this.nome = nome;
        this.valoreEnergetico = valoreEnergetico;
        this.scedenza = scedenza;
    }
}
