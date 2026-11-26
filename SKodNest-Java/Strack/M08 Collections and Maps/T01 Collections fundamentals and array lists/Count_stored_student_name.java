import java.util.ArrayList;
import java.util.Scanner;

public class Count_stored_student_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: Read and add n names.
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            names.add(name);
        }
        // TODO: Print the current size of names.
        System.out.println(names.size());

    }

}