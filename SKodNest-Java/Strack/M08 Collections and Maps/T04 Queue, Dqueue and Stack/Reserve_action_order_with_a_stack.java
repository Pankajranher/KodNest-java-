import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Reserve_action_order_with_a_stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<String> actions = new ArrayDeque<String>();
        // TODO: read n actions and push them
        for (int i = 0; i < n; i++) {
            actions.push(sc.next());
        }
        // TODO: while not empty, pop and print
        while (!actions.isEmpty()) {
            System.out.println(actions.pop());

        }
    }
}