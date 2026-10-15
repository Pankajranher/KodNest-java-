import java.util.Scanner;

interface Notifiable {
    void notifyUser();

}

class EmailAlert implements Notifiable {
    String message;

    EmailAlert(String message) {
        // Store message
        this.message = message;
    }

    @Override
    public void notifyUser() {
        // Print alert
        System.out.println("Email alert: " + message);
    }
}

public class Implement_A_notification_contract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();
        // Use a Notifiable reference
        EmailAlert em = new EmailAlert(message);

        Notifiable ref;
        ref = em;

        ref.notifyUser();

    }

}