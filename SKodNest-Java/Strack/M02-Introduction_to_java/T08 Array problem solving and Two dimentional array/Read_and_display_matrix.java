import java.util.Scanner;

public class Read_and_display_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                arr[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
