import java.util.Scanner;

class OrderTask implements Runnable {
    private int count;

    OrderTask(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        // Print each order in sequence.
        for (int i = 1; i <= count; i++) {
            System.out.println("Order " + i + " processed");

        }
    }
}

public class Create_an_order_processing_runable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Build a Thread with new OrderTask(n) and start it.
        OrderTask o = new OrderTask(n);
        Thread t = new Thread(o);
        t.start();

        sc.close();
    }
}