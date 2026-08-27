
import java.util.Scanner;

public class Count_positive_negative_and_zero_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                posCount += 1;
            } else if (arr[i] < 0) {
                negCount += 1;
            } else {
                zeroCount += 1;
            }
        }
        System.out.println(posCount + " ");
        System.out.println(negCount + " ");
        System.out.println(zeroCount);

        scanner.close();

    }
}