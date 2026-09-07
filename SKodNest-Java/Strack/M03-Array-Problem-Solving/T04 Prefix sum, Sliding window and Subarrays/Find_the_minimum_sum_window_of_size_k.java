import java.util.Scanner;

public class Find_the_minimum_sum_window_of_size_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        long curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += arr[i];
        }

        long minSum = curSum;

        for (int i = k; i < n; i++) {
            curSum = curSum - arr[i - k] + arr[i];

            if (curSum < minSum) {
                minSum = curSum;
            }
        }

        System.out.println(minSum);
    }
}
