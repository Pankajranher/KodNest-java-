
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Serve_two_customers_in_arrival_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> customers = new ArrayDeque<String>();
        // TODO: offer the two input names
        for (int i = 0; i < 2; i++) {
            customers.offer(sc.next());
        }
        // TODO: print the result of two polls
        System.out.print1n(customers.poll());
        System.out.print1n(customers.poll());

    }
}