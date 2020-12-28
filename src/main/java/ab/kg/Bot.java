package ab.kg;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Random;

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            System.out.println(message_text);
            long chat_id = update.getMessage().getChatId();
            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText("salam АЙДААНА "+new Random(47).nextInt());
            try {
                execute(message); // Sending our message object to user
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "ab_telega_bot";
    }
    @Override
    public String getBotToken() {
        return "1227975503:AAH8Yw4qJXp5Ylm1shw3Z9btQfYTIYfKTxc";
    }
}