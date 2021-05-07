package dietasmart;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Payd3r
 */
public class Ricette {

    ArrayList ricette;

    Ricette() {
        ricette = new ArrayList<Ricetta>();
    }

    public void setRicetta(Ricetta r) {
        ricette.add(r);
    }

    public boolean controllaDisponibilita(Ricetta r) {
        Prodotto p;
        boolean check = false;
        for (int i = 0; i < r.necessario.size() && !check; i++) {
            p = (Prodotto) r.necessario.get(i);
            if (Prodotti.getInstance().GetProduct(i).equals(p)) {
                check = true;
            }
        }
        return check;
    }

    public void usaRicetta(Ricetta r) {
        Prodotto p;
        for (int i = 0; i < r.necessario.size(); i++) {
            p = (Prodotto) r.necessario.get(i);
            Prodotti.getInstance().removeProduct(p);
        }
    }

    public String visualizzaDisponibili() {

    }

    public String visualizza() {
        String s = "";
        Ricetta r;
        for (int i = 0; i < ricette.size(); i++) {
            s+="rice"
            r = (Ricetta) ricette.get(i);
            
        }
    }
}
