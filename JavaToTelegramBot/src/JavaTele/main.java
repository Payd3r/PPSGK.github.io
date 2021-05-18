/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTele;


import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author studente
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi api = new TelegramBotsApi();
        try {
            api.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            // gestione errore in registrazione
        }
    }
    
}
