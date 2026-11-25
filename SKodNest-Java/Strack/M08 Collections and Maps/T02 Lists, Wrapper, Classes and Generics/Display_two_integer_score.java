import java.util.ArrayList;
import java.util.Scanner;

public class Display_two_integer_score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<Integer>();
        // TODO: read and store two integer scores
        int sc1 = sc.nextInt();
        int sc2 = sc.nextInt();

        marks.add(sc1);
        marks.add(sc2);
        // TODO: print the first and second entries separately
        System.out.println(marks.get(0));
        System.out.println(marks.get(1));
    }
}