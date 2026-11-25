import java.util.LinkedList;
import java.util.Scanner;

public class Build_a_link_list_of_two_tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        LinkedList<String> tasks = new LinkedList<String>();
        // TODO: add first and second
        tasks.add(first);
        tasks.add(second);
        // TODO: print tasks
        System.out.println(tasks);

    }

}