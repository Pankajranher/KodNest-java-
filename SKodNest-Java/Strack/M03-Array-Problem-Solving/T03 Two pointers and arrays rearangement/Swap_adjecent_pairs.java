import java.util.Scanner;

public class Swap_adjecent_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Loop through the array, skipping by 2 to process pairs
        // Stop at 'n - 1' to avoid breaking on odd lengths
        for (int i = 0; i < n - 1; i += 2) {
            // Swap adjacent elements using a temporary variable
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Print the modified array
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
