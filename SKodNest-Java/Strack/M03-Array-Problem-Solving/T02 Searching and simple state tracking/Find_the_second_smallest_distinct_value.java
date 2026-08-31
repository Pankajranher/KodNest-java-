import java.util.Scanner;

public class Find_the_second_smallest_distinct_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize with a value larger than any possible input (max constraint is
        // 10^9)
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                // Current smallest becomes second smallest
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                // Found a number between smallest and second smallest
                secondSmallest = arr[i];
            }
        }

        // If secondSmallest was never updated, a distinct second value does not exist
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secondSmallest);
        }
    }
}
