/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.util.ArrayList;

/**
 *
 * @author Payd3r
 */
public class Ricetta {

    ArrayList necessario;

    Ricetta() {
        necessario = new ArrayList<Prodotto>();
    }

    Ricetta(Prodotti a, String preparazione, int tempo) {

    }

    public Ricetta menoTempo() {
        //trovare la ricetta piu' velece da fare
        return new Ricetta();
    }

    public Ricetta salutare() {
        //trovare la ricetta piu' salutare da fare
        return new Ricetta();
    }

    public Ricetta calorica() {
        //trovare la ricetta piu' calorica da fare
        return new Ricetta();
    }

    public Ricetta facileDaFare() {
        //trovare la ricetta piu' facileDaFare da fare
        return new Ricetta();
    }
}
