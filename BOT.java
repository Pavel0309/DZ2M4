public class BOT extends TelegramLongPollingBot {
    public  String getBotUsername(){
        return "synergy_vebinarik"
    }
    public String getBotToken(){
        return  "как это найти?"
    ;
    }
    public void onUpdateReceived(Update update){
        Message message= update.getMassage();
        String chatId = message.getChatId().toString();

    }
}
