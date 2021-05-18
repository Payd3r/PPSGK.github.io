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
    Ricetta ricetta;

    Ricette() {
        ricette = new ArrayList<Ricetta>();
    }

    Ricette(ArrayList<Ricetta> r) {
       ricette=r;
    }

    public void setRicetta(Ricetta r) {
        ricette.add(r);
    }

    public void RimuoviRicetta(Ricetta r) {
        for (int i = 0; i < ricette.size(); i++) {   //passo la ricetta, se nome è uguale la rimuovo
            ricetta = (Ricetta) ricette.get(i);
            if (ricetta.nome == r.nome) {
                ricette.remove(i);
            }
        }
    }

    

    public ArrayList<Ricetta> trovaRealizzabili(ArrayList<Ricetta> a, ArrayList<Prodotto> b) {
        int controllo=0;
        ArrayList<Ricetta> realizzabili = new ArrayList<Ricetta>();
        String[] x;
        for (Ricetta tmp : a) {
            x = tmp.necessario.split(",");
            for (Prodotto temp : b) {
                
                for (int i = 0; i < x.length; i++) {
                    if (x[0] == temp.nome){
                        controllo++;
                    }
                }
                
                
            }
            if(controllo==x.length){
                controllo=0;
                realizzabili.add(tmp);
            }
                
           
        }
        return realizzabili;
    }

    /*
    public void usaRicetta(Ricetta r) {
        Prodotto p;
        for (int i = 0; i < r.necessario.size(); i++) {
            p = (Prodotto) r.necessario.get(i);
            Prodotti.getInstance().removeProduct(p);
        }
    }
     */
    
    /*
    public String visualizza() {
        String s = "";
        Ricetta r;
        for (int i = 0; i < ricette.size(); i++) {
            s += "rice";
            r = (Ricetta) ricette.get(i);

        }

        return s;
    }
     */
    public Ricetta TrovaRicettaCalorica() {

        Ricetta temp1, temp2;
        Ricetta trovata = new Ricetta();
        for (int i = 0; i < ricette.size() - 1; i++) {
            for (int j = 0; j < ricette.size(); j++) {
                temp1 = (Ricetta) ricette.get(i);
                temp2 = (Ricetta) ricette.get(j);
                if (temp1.valoreEnergetico[0] > temp2.valoreEnergetico[0]) {
                    trovata = temp1;
                } else {
                    trovata = temp2;
                }
            }
        }

        return trovata;
    }

    public String TrovaRicettaProteica() {
        String str = "";
        Ricetta temp1, temp2;
        Ricetta trovata = new Ricetta();
        for (int i = 0; i < ricette.size() - 1; i++) {
            for (int j = 0; j < ricette.size(); j++) {
                temp1 = (Ricetta) ricette.get(i);
                temp2 = (Ricetta) ricette.get(j);
                if (temp1.valoreEnergetico[1] > temp2.valoreEnergetico[1]) {
                    trovata = temp1;
                } else {
                    trovata = temp2;
                }
            }
        }
        str = trovata.nome;
        return str;
    }

    public String TrovaRicettaSalutare() {
        String str = "";
        Ricetta temp1, temp2;
        Ricetta trovata = new Ricetta();
        for (int i = 0; i < ricette.size() - 1; i++) {
            for (int j = 0; j < ricette.size(); j++) {
                temp1 = (Ricetta) ricette.get(i);
                temp2 = (Ricetta) ricette.get(j);
                if (temp1.valoreEnergetico[2] < temp2.valoreEnergetico[2]) {
                    trovata = temp1;
                } else {
                    trovata = temp2;
                }
            }
        }
        str = trovata.nome;
        return str;
    }

    public String TrovaRicettaFacile() {
        String str = "";
        Ricetta temp1, temp2;
        Ricetta trovata = new Ricetta();
        for (int i = 0; i < ricette.size() - 1; i++) {
            for (int j = 0; j < ricette.size(); j++) {
                temp1 = (Ricetta) ricette.get(i);
                temp2 = (Ricetta) ricette.get(j);
                if (temp1.difficolta < temp2.difficolta) {
                    trovata = temp1;
                } else {
                    trovata = temp2;
                }
            }
        }
        str = trovata.nome;
        return str;
    }
}
