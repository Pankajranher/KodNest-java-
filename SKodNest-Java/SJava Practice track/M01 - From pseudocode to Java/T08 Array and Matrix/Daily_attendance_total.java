import java.util.Scanner;

public class Daily_attendance_total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classes = scanner.nextInt();
        int days = scanner.nextInt();
        int[][] attendance = new int[classes][days];

        // Read the matrix
        for (int i = 0; i <= classes - 1; i++) {
            for (int j = 0; j <= days - 1; j++) {
                attendance[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display one total for every day
        for (int i = 0; i <= days - 1; i++) {
            int total = 0;

            for (int j = 0; j <= classes - 1; j++) {
                total += attendance[j][i];
            }
            System.out.println("Day " + (i + 1) + " total: " + total);
        }
    }
}