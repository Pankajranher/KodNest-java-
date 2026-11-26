import java.util.ArrayList;
import java.util.Scanner;

public class Print_the_first_registrationn_student_copy_link {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: Add the n names using a loop.
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            names.add(name);
        }
        // TODO: Print only the first element.
        System.out.println(names.get(0));

    }

}