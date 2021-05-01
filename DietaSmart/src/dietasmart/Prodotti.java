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
public class Prodotti {

    ArrayList prodotti; //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

    Prodotti() {
        prodotti = new ArrayList<Prodotto>();
    }

    public void AddProduct(Prodotto p) {
        prodotti.add(p);
    }

    public boolean removeProduct(Prodotto p) {
        for (int i = 0; i < prodotti.size(); i++) {
            if (prodotti.get(i).equals(p)) {
                prodotti.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean partOfProduct(String name, int quantita) {
        //rimuovere una quantita' di un prodotto
        return true;
    }
}
