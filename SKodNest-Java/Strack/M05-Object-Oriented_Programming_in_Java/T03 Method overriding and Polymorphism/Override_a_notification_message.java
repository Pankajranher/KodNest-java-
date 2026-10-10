import java.util.Scanner;

class Notification {
    public void send(String message) {
        System.out.println("Notification " + message);

    }
}

class EmailNotification extends Notification {
    // Override send()
    @Override
    public void send(String message) {
        System.out.println("Email " + message);

    }

}

public class Override_a_notification_message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String mess = scanner.next();
        EmailNotification note = new EmailNotification();
        note.send(mess);

    }
}