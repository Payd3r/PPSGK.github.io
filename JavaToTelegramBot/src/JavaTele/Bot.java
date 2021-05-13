package JavaTele;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

import java.util.logging.Level;

import static org.telegram.telegrambots.logging.BotLogger.log;

class Bot extends TelegramLongPollingBot {

    boolean check = false;



        public void onUpdateReceived(Update update) {
            String msg = update.getMessage().getText();  //
            String chatId=update.getMessage().getChatId().toString(); //riceve il id di utente
            SendMessage sendMessage = new SendMessage(); //crea messaggio
            sendMessage.setChatId(chatId); //sceglie a chi inviare
            sendMessage.setText(msg); //il messaggio

            try {
                execute(sendMessage); //invia messaggio
            } catch (TelegramApiException e) {

            }
        }



    @Override
    public String getBotUsername() {
        return "AlertBot";
    } //Nome di BOT


    @Override
    public String getBotToken() {
        return "1808508898:AAGbuwoN7OYhYFYJQ2la8vRKfdRHZio0OVo";
    } //Token di BOT
}