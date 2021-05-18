/*package dietasmart;


import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import static org.telegram.telegrambots.logging.BotLogger.log;

class Bot extends TelegramLongPollingBot {

    private String msg;
    private String chatId;
    private int messageId;

    public Bot(){
        msg="Unknown";
        chatId="Unknown";
        chatId = "";
        messageId = 0;

    }


    //Avvia il bot
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        String msg = message.getText();
        chatId = message.getChatId().toString(); //riceve il id di utente
        messageId = message.getMessageId();


        if (message != null && message.hasText()) {
            switch (message.getText()) {
                case "/start":
                    sendMsg(message, "Start bot");
                    break;

                case "Команда 1":
                    sendMsg(message, "Stop");
                    break;

                default:
                    sendMsg(message, "Default");
                    break;
            }
        }

    }


    public void sendMsg(Message message, String text){

        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);

        // Si crea i bottoni
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        // Si crea Lista dei bottoni
        List<KeyboardRow> keyboard = new ArrayList<>();

        // Prima riga bottoni
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        // Aggiungiuamo i bottoni nella prima riga
        keyboardFirstRow.add("Start");
        keyboardFirstRow.add("Stop");


        // Set bottoni nella lista
        keyboard.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboard);

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }




    public void alert(String text){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setReplyToMessageId(messageId);
        sendMessage.setText("Atenzione prodotto: " + text + " scaduto!");

        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }




    /* test metodo rinvia il messaggio
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        String chatId=update.getMessage().getChatId().toString(); //riceve il id di utente
        SendMessage sendMessage = new SendMessage(); //crea messaggio
        sendMessage.setChatId(chatId); //sceglie a chi inviare
        sendMessage.setText(msg); //il messaggio

        try {
            execute(sendMessage); //invia messaggio
        } catch (TelegramApiException e) {

        }
    }

    //Dati di BOT
    @Override
    public String getBotUsername() {
        return "AlertBot";
    } //Nome di BOT

    @Override
    public String getBotToken() {
        return "1808508898:AAGbuwoN7OYhYFYJQ2la8vRKfdRHZio0OVo";
    } //Token di BOT

}*/