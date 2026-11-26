import java.util.HashSet;
import java.util.Scanner;

public class Count_three_day_different_attendence_ids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> ids = new HashSet<Integer>();
        // TODO: read three integer IDs and add each one
        for (int i = 0; i < 3; i++) {
            ids.add(sc.nextInt());
        }
        // TODO: print the number of distinct IDs
        System.out.println(ids.size());

    }

}
