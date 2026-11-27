import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Process_support_tickets_in_FIFO_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> tickets = new ArrayDeque<String>();
        // TODO: read n IDs and offer each one
        for (int i = 0; i < n; i++) {
            tickets.offer(sc.next());
        }
        // TODO: while queue is not empty, poll and print the ticket
        while (!tickets.isEmpty()) {
            System.out.print1n(tickets.poll());

        }

    }

}