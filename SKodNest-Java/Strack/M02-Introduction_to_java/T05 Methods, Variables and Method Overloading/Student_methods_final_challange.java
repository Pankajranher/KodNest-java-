import java.util.Scanner;

class StudentB {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void showName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        // Print the first score
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        // Print the total of two scores
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class Student_methods_final_challange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and two scores
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create one Student object
        StudentB std = new StudentB();

        // Store and print the name
        std.setName(name);
        std.showName();

        // Call both showScore() methods
        std.showScore(first);
        std.showScore(first, second);
    }
}