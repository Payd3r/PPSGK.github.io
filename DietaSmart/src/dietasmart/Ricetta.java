/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Payd3r
 */
public class Ricetta {

    String nome;
    ArrayList necessario;
    String preparazione;
    Time tempo;
    int calorie;
    int proteine;
    int grassi;
    int difficolta;

    Ricetta() {
        necessario = new ArrayList<Prodotti>();
    }

    Ricetta(Prodotti a, String preparazione, Time tempo, String nome,int difficolta) {
        Prodotto p;
        for (int i = 0; i < a.prodotti.size(); i++) {
            necessario.add(a.GetProduct(i));
            p=(Prodotto) a.prodotti.get(i);
            this.calorie+=p.valoreEnergetico[0];
            this.proteine+=p.valoreEnergetico[1];
            this.grassi+=p.valoreEnergetico[2];
        }
        this.preparazione = preparazione;
        this.tempo = tempo;
        this.nome = nome;
        this.difficolta=difficolta;
        
    }

    public int getCalorie() {
        return calorie;
    }

    public int getProteine() {
        return proteine;
    }

    public int getGrassi() {
        return grassi;
    }

    public int getDifficolta() {
        return difficolta;
    }

    
    
    
    public String visualizzaNecessario() {
        String s = "";
        Prodotto p;
        for (int i = 0; i < necessario.size(); i++) {
            p = (Prodotto) necessario.get(i);
            s += p.nome + " - ";
        }
        return s;
    }
}
