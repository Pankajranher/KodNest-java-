import java.util.HashSet;
import java.util.Scanner;

public class Count_distint_workshop_ids_with_hashset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> ids = new HashSet<Integer>();
        // TODO: read n integer IDs and add them to ids
        for (int i = 0; i < n; i++) {
            ids.add(sc.nextInt());
        }
        // TODO: print the number of unique IDs

        System.out.println(ids.size());

    }

}