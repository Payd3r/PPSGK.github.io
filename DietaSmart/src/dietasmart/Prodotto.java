/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dietasmart;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Payd3r
 */
public class Prodotto {

    public String nome; //pasta
    int[] valoreEnergetico;//[82,9% carboidrati, 13,7% proteine, 3,4% grassi]
    Date scadenza; //https://docs.oracle.com/javase/7/docs/api/java/sql/Time.html

    public Prodotto() {
        this.nome = " ";
        this.valoreEnergetico = new int[]{0, 0, 0};
        this.scadenza = new Date("01/01/1900");
    }

    public Prodotto(String nome, String calorie, String proteine, String grassi, String scedenza) throws ParseException {
        this.nome = nome;
        this.valoreEnergetico = new int[]{Integer.parseInt(calorie), Integer.parseInt(proteine), Integer.parseInt(grassi)};
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        scadenza = format.parse(scedenza);
    }

    public String valoreEnergetico() {
        String str = "";
        str = valoreEnergetico.toString();
        return str;
    }

    public String getScadenza() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(scadenza);
    }
}
