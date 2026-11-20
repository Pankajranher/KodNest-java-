import java.util.Scanner;

class NotificationTask implements Runnable {
    private String message;
    private int count;

    NotificationTask(String message, int count) {
        this.message = message;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(message);
        }
    }
}

public class Build_a_notification_runable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int n = sc.nextInt();
        // Start a Thread(new NotificationTask(message, n)).
        NotificationTask task = new NotificationTask(message, n);

        Thread t = new Thread(task);
        t.start();

        sc.close();
    }
}