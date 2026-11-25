import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Update_a_linked_list_task_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String newTask = sc.next();
        List<String> jobs = new LinkedList<String>();
        jobs.add(first);
        jobs.add(second);
        // TODO: insert newTask at index 1
        jobs.add(1, newTask);

        // TODO: remove element at index 0
        jobs.remove(0);
        // TODO: print jobs
        System.out.println(jobs);

    }
}