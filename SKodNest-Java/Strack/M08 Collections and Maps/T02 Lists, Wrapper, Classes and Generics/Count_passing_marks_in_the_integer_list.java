import java.util.ArrayList;
import java.util.Scanner;

public class Count_passing_marks_in_the_integer_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            marks.add(sc.nextInt());
        }
        int count = 0;
        // TODO: traverse the list and count scores >= 50
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) >= 50) {
                count += 1;

            }
            // TODO: print count
            System.out.println(count);

        }

    }
}