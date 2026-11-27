import java.util.PriorityQueue;
import java.util.Scanner;

public class Serve_three_numeric_priorities_in_ascending_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> priorities = new PriorityQueue<Integer>();
        // TODO: read and offer three priority values
        for (int i = 0; i < 3; i++) {
            int value = sc.nextInt();
            priorities.offer(value);
        }
        // TODO: print three values using poll()
        for (int i = 0; i < 3; i++) {
            System.out.println(priorities.poll());
        }
    }
}