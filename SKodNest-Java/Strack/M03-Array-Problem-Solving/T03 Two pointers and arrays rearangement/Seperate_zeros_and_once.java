import java.util.Scanner;

public class Seperate_zeros_and_once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. Read binary elements (0s and 1s)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Two-pointer partitioning
        int left = 0;
        int right = n - 1;

        while (left < right) {
            // Move left forward if it's already a correct 0
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Move right backward if it's already a correct 1
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap a misplaced 1 on the left with a misplaced 0 on the right
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // 4. Print the partitioned binary array
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
