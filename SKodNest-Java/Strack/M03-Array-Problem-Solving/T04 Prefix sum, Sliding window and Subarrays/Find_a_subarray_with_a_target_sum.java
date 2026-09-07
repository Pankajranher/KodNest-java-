import java.util.Scanner;

public class Find_a_subarray_with_a_target_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long target = sc.nextLong();

        int start = 0;
        long curSum = 0;
        boolean found = false;

        for (int end = 0; end < n; end++) {
            curSum += arr[end];

            while (curSum > target && start <= end) {
                curSum -= arr[start];
                start++;
            }

            if (curSum == target && start <= end) {
                System.out.println(start + " " + end);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }
}
