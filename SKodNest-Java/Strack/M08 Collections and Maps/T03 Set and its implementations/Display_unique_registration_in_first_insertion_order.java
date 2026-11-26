import java.util.LinkedHashSet;
import java.util.Scanner;

public class Display_unique_registration_in_first_insertion_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashSet<String> names = new LinkedHashSet<String>();
        // TODO: read n names and add each to names
        for (int i = 0; i < n; i++) {
            names.add(sc.next());

            // TODO: use enhanced for-loop to print each unique name
            for (String name : names) {
                System.out.println(name);

            }

        }

    }

}