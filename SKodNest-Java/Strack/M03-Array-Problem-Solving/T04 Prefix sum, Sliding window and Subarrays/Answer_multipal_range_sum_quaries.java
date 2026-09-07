import java.util.Scanner;

public class Answer_multipal_range_sum_quaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] pSum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                pSum[i] = arr[i];
            } else {
                pSum[i] = pSum[i - 1] + arr[i];
            }
        }

        int queries = sc.nextInt();

        for (int q = 0; q < queries; q++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            int sum;
            if (left == 0) {
                sum = pSum[right];
            } else {
                sum = pSum[right] - pSum[left - 1];
            }

            System.out.println(sum);
        }
    }
}
