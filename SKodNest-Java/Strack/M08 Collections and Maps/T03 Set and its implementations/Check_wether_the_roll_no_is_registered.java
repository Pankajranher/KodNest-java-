import java.util.HashSet;
import java.util.Scanner;

public class Check_wether_the_roll_no_is_registered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> rolls = new HashSet<Integer>();
        // TODO: read and add three roll numbers
        for (int i = 0; i < 3; i++) {
            rolls.add(sc.nextInt());

            int target = sc.nextInt();
            // TODO: print whether target is present
            System.out.println(rolls.contains(target));

        }

    }

}
