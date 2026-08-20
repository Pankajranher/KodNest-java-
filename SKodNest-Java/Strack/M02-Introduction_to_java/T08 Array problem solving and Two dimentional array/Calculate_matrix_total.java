import java.util.Scanner;

public class Calculate_matrix_total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        // int total = 0;
        for (int i = 0; i < rows; i++) {
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);

        }
    }
}