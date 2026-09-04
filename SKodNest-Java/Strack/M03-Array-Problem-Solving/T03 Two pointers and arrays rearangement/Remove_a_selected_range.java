import java.util.Scanner;

public class Remove_a_selected_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            int left = sc.nextInt();
            int right = sc.nextInt();

            if (left < 0 || right >= n || left > right) {
                System.out.println("-1");
                return;
            }

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();

        }
    }
}