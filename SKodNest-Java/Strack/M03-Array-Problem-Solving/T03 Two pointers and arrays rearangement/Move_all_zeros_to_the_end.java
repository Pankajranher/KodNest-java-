import java.util.Scanner;

public class Move_all_zeros_to_the_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int writeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }
        while (writeIndex < n) {
            arr[writeIndex] = 0;
            writeIndex++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
}
