import java.util.Scanner;

public class Array_traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter array element");
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(":::: " + a[i]);
        }
    }
}
