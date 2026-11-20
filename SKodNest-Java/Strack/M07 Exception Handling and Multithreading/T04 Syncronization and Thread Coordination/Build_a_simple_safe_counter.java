import java.util.Scanner;

class Counter {

    private int value;

    Counter(int initial) {
        value = initial;
    }

    synchronized void increment() {
        value++;
    }

    synchronized int getValue() {
        return value;
    }
}

class CounterWorker extends Thread {

    private Counter counter;

    CounterWorker(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        // Increment exactly once
        counter.increment();
    }
}

public class Build_a_simple_safe_counter {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Create one shared Counter object
        Counter shared = new Counter(n);

        // Create two worker threads
        CounterWorker t1 = new CounterWorker(shared);
        CounterWorker t2 = new CounterWorker(shared);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to complete
        t1.join();
        t2.join();

        // Print final result
        System.out.println("Total: " + shared.getValue());

        sc.close();
    }
}
