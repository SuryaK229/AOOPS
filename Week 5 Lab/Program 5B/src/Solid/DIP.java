package Solid;

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}

public class DIP {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.sendMessage("Hello, World!");

        MessageService smsService = new SMSService();
        app = new MyApplication(smsService);
        app.sendMessage("Hello, World via SMS!");
    }
}
