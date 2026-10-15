import java.util.Scanner;

abstract class Message {
    abstract void send();
}

class SMS extends Message {
    // Add number, constructor and send()
    String number;

    SMS(String number) {
        this.number = number;
    }

    public void send() {
        System.out.println("SMS sent to " + number);
    }
}

public class send_an_SMS_message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        // Create object and call send()
        SMS sms = new SMS(number);
        sms.send();
    }
}