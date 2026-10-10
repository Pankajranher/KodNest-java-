import java.util.Scanner;

class Message {
    public void show(String text) {
        System.out.println("Message " + text);
    }
}

class EmailMessage extends Message {
    // Override show()
    @Override
    public void show(String text) {
        System.out.println("Email " + text);
    }
}

class SmsMessage extends Message {
    // Override show()
    @Override
    public void show(String text) {
        System.out.println("SMS " + text);
    }
}

public class Select_a_runtime_message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input, select object and call show()
        int choice = scanner.nextInt();
        String msg = scanner.next();

        Message m;
        if (choice == 1) {
            m = new EmailMessage();
        } else {
            m = new SmsMessage();
        }
        if (m != null) {
            m.show(msg);
        }
    }
}