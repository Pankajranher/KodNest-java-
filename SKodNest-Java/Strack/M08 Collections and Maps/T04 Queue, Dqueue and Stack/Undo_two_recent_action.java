import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Undo_two_recent_action {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> actions = new ArrayDeque<String>();
        // / TODO: push both names
        actions.push(sc.next());
        actions.push(sc.next());
        // TODO: print two popped values
        System.out.println(actions.pop());
        System.out.println(actions.pop());
    }
}