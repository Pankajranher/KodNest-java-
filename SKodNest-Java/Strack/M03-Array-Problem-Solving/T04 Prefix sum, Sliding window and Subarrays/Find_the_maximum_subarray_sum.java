import java.util.Scanner;

public class Find_the_maximum_subarray_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long curSum = arr[0];
        long maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            if (curSum < 0) {
                curSum = arr[i];
            } else {
                curSum = curSum + arr[i];
            }

            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }

        System.out.println(maxSum);
    }
}
