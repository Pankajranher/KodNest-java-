
import java.util.TreeSet;
import java.util.Scanner;

class Priint_three_distinct_scores_in_sorted_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> values = new TreeSet<Integer>();
        // TODO: read three integer values and add to values
        for (int i = 0; i < 3; i++) {
            values.add(sc.nextInt());
        }
        // TODO: print the unique values using enhanced for-loop
        for (int vals : values) {
            System.out.println(vals);

        }
    }
}