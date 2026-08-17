
import java.util.Scanner;

class Analyze_runtime_data {
    public static void main(String[] args) {
        // Write your code here.
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int a[] = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        for (int j = 0; j <= a.length - 1; j++) {
            total += a[j];
        }
        scanner.close();
        System.out.println("Total: " + total);
    }
}