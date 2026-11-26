import java.util.ArrayList;
import java.util.Scanner;

public class Input_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter the element: ");
        for (int i = 0; i <= n; i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.println("ArrayList: " + al);
        System.out.println();
        System.out.println("Traverse usiing the for loop");
        for (int i = 0; i < al.size() - 1; i++) {
            System.out.println(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Travers using the ADVANCE FOR LOOP");
        for (Object x : al) {// Integer
            System.out.println(x + " ");
        }
    }
}
