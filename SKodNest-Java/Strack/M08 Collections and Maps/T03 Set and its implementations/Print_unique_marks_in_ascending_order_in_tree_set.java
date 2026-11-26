import java.util.TreeSet;
import java.util.Scanner;

public class Print_unique_marks_in_ascending_order_in_tree_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> marks = new TreeSet<Integer>();
        // TODO: read and add n marks
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }
        // TODO: print each distinct mark using enhanced for-loop
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}