import java.util.Scanner;

public class Max_element_from_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Max Element: " + max);
        sc.close();
    }
}
