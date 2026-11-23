import java.util.ArrayList;
import java.util.Scanner;

public class Create_a_student_name_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: add first and second in this order
        names.add(first);
        names.add(second);
        // TODO: print the ArrayList
        System.out.println(names);

    }

}