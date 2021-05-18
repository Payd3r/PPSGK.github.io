package dietasmart;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import jersey.repackaged.org.objectweb.asm.TypeReference;
import org.telegram.telegrambots.api.objects.Update;

public class ThreadBot extends Thread{

    Frame f;
    Bot bot;
    ArrayList<Prodotto> list;
    Prodotto p;
    DateFormat formatoData;
    String currentData, path;

    ThreadBot(Frame f, Bot b, Prodotto p){
        this.f = f;
        bot = b;
        list = new ArrayList<Prodotto>();
        path = "percorso";
        this.p = p;
        Date d = new Date();
        formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
        currentData = formatoData.format(d);
    }


    @Override
    public void run() {

        while (true){
         try {
             //scan file
             //prendo la lista dei prodotti
             list = f.LeggiDaFileProdotti(path);


             //per ogni prodotto confronta la data di scadenza
             for (int i=0; i<list.size()-1; i++){
                 if (list.get(i).getScadenza().compareTo(currentData)){
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

