import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Remove_the_last_item_from_a_deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> items = new ArrayDeque<String>();
        // TODO: add two items at the back
        items.offerLast(sc.next());
        items.offerLast(sc.next());
        // TODO: print the item removed from the back
        System.out.println(items.pollLast());

    }
}