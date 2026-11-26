import java.util.LinkedHashSet;
import java.util.Scanner;

public class Display_three_unique_club_member {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<String>();
        // TODO: read and add exactly three names
        for (int i = 0; i < 3; i++) {
            names.add(sc.next());
        }
        // TODO: print each unique name in the Set
        for (String name : names) {
            System.out.println(name);

        }
    }
}