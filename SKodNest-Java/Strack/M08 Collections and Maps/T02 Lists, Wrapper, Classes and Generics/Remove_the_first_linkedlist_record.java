import java.util.LinkedList;
import java.util.Scanner;

public class Remove_the_first_linkedlist_record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<String>();
        for (int i = 0; i < 3; i++) {
            tasks.add(sc.next());
        }
        // TODO: remove the first List element
        tasks.remove(0);
        // TODO: print tasks
        System.out.println(tasks);

    }

}