import java.util.Scanner;

public class Input_with_conditions_and_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int total = 0;

        for (int i = 0; i < days; i++) {
            total += scanner.nextInt();
        }

        String status;
        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
