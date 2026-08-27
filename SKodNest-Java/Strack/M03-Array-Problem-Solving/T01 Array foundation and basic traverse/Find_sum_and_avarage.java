import java.util.Scanner;

public class Find_sum_and_avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avarage = (double) sum / n;
        System.out.println(sum);
        System.out.printf("%.2f%n", avarage);
        scanner.close();
    }
}