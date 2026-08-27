import java.util.Scanner;

public class Find_minimum_and_maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minNum = arr[0];
        int maxNum = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            } else if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        System.out.print(minNum + " ");
        System.out.println(maxNum);

        scanner.close();
    }
}