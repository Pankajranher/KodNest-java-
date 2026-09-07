import java.util.Scanner;

public class Find_the_equilibrium_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        long leftSum = 0;
        int equilibriumIndex = -1;

        for (int i = 0; i < n; i++) {
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break;
            }
            leftSum += arr[i];
        }

        System.out.println(equilibriumIndex);
    }
}
