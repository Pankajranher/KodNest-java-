import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return first + second + third;
    }
}

class Calculate_totals_with_overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int marks1 = scanner.nextInt();
        int marks2 = scanner.nextInt();
        int marks3 = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator rc = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + rc.getTotal(marks1, marks2));
        System.out.println("Three-Mark Total: " + rc.getTotal(marks1, marks2, marks3));
    }
}