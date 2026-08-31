import java.util.Scanner;

public class Find_the_first_non_repeting_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each element one by one from left to right
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count total occurrences across the entire array
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If it appears exactly once, it's our first non-repeating value
            if (count == 1) {
                System.out.println(arr[i]);
                return; // Exit program immediately
            }
        }

        // If no element has a frequency of 1
        System.out.println(-1);
    }
}
