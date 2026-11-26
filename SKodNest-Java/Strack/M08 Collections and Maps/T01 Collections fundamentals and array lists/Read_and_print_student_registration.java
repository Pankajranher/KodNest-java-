import java.util.ArrayList;
import java.util.Scanner;

class Read_and_print_student_registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        // TODO: Read n names and add each to names.
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            names.add(name);
        }
        // TODO: Use size() and get(i) to print each name.
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
    }
}