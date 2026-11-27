import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Process_urgent_and_regular_task_with_dequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String urgent = sc.next();
        String regular1 = sc.next();
        String regular2 = sc.next();
        Deque<String> tasks = new ArrayDeque<String>();
        // TODO: add regular tasks at the back
        tasks.offerLast(regular1);
        tasks.offerLast(regular2);
        // TODO: add urgent at the front
        tasks.offerFirst(urgent);
        // TODO: remove from the front and print until empty
        // tasks.pollFirst();

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());

        }
    }
}