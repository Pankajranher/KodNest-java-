import java.util.Scanner;

public class Move_negative_values_to_the_begining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            while (left < right && arr[left] < 0) {
                left++;
            }

            while (left < right && arr[right] >= 0) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
