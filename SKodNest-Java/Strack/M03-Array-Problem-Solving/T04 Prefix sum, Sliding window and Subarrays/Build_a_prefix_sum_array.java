import java.util.Scanner;

public class Build_a_prefix_sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] pSum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pSum[i] = pSum[i - 1] + arr[i];
        }

        for (int j = 0; j < n; j++) {
            System.out.print(pSum[j] + " ");
        }
    }
}
