import java.util.Scanner;

public class Compare_practice_plan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];

        // Read the planned values
        for (int i = 0; i <= planned.length - 1; i++) {
            planned[i] = scanner.nextInt();
        }

        // Read the completed values
        for (int j = 0; j <= completed.length - 1; j++) {
            completed[j] = scanner.nextInt();
        }
        // Compare both arrays
        int completedDaysCount = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": ");

            if (completed[i] >= planned[i]) {
                System.out.println("Completed");
                completedDaysCount++;
            } else {
                System.out.println("Pending");
            }

            // Print each day's status and the completed-day count
            System.out.print("Completed days: " + completedDaysCount);
        }
    }
}