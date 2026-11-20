import java.util.Scanner;

class TaskWorker extends Thread {
    private int count;

    TaskWorker(int count) {
        this.count = count;
    }

    public void run() {
        // Print N task messages in a loop.
        for (int i = 1; i <= count; i++) {
            System.out.println("Processed task " + i);
        }
    }
}

public class Create_a_task_processing_thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Construct one TaskWorker, then start it.
        TaskWorker t = new TaskWorker(n);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        sc.close();
    }

}