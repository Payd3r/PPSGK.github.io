/*package dietasmart;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadBot extends Thread {

    Frame f;
    Bot bot;
    ArrayList<Prodotto> list;
    Prodotto p;
    String path;
    GregorianCalendar dataAttuale;
    int giorno, mese, anno;

    ThreadBot(Frame f, Bot b, Prodotto p) {
        this.f = f;
        bot = b;
        list = new ArrayList<Prodotto>();
        path = "percorso";
        this.p = p;
        dataAttuale = new GregorianCalendar();
    }

    @Override
    public void run() {
        dataAttuale = new GregorianCalendar();

        while (true) {
            try {
                //scan file
                //prendo la lista dei prodotti

                try {
                    list = f.LeggiDaFileProdotti(path);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                giorno = dataAttuale.get(GregorianCalendar.DAY_OF_MONTH);
                mese = dataAttuale.get(GregorianCalendar.MONTH);
                anno = dataAttuale.get(GregorianCalendar.YEAR);
                GregorianCalendar dataAttuale = new GregorianCalendar(anno, mese, giorno);

                //per ogni prodotto confronta la data attuale con la data di scadenza
                for (int i = 0; i < list.size() - 1; i++) {

                    String[] dataProdotto = list.get(i).getScadenza().split("/");
                    int giornoProdotto = Integer.parseInt(dataProdotto[0]);
                    int meseProdotto = Integer.parseInt(dataProdotto[1]);
                    int annoProdotto = Integer.parseInt(dataProdotto[2]);
                    GregorianCalendar dataDiScadenza = new GregorianCalendar(annoProdotto, meseProdotto, giornoProdotto);

                    if (dataAttuale.after(dataDiScadenza)) {
                        String nome = list.get(i).nome;
                        bot.alert(nome);
                    }
                }

                //wait 2 min
                Thread.sleep(120000);

            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadBot.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
*/
