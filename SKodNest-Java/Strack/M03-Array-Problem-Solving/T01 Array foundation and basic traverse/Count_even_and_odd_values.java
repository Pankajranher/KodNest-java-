import java.util.Scanner;

public class Count_even_and_odd_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;

            }

        }

        System.out.print(evenCount + " ");

        System.out.println(oddCount);

        scanner.close();
    }
}
