import java.util.Scanner;

class Counter {

    private int value = 0;

    synchronized void increment() {
        value++;
    }

    synchronized int getValue() {
        return value;
    }
}

class CounterWorker extends Thread {

    private Counter counter;
    private int times;

    CounterWorker(Counter counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    public void run() {

        // Increment counter exactly 'times' times
        for (int i = 0; i < times; i++) {
            counter.increment();
        }
    }
}

public class Build_a_thread_safe_counter {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Counter shared = new Counter();

        // Create two workers using the SAME shared counter
        CounterWorker t1 = new CounterWorker(shared, n);
        CounterWorker t2 = new CounterWorker(shared, n);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Print final counter value
        System.out.println("Total: " + shared.getValue());

        sc.close();
    }
}
