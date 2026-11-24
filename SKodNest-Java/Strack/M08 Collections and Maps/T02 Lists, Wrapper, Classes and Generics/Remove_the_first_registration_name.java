import java.util.ArrayList;
import java.util.Scanner;

public class Remove_the_first_registration_name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            names.add(sc.next());
        }
        // TODO: remove the first element
        names.remove(0);
        // TODO: print the updated list
        System.out.println(names);

    }
}