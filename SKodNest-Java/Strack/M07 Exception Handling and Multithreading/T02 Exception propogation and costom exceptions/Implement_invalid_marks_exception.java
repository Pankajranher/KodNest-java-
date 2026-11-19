import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);

    }
}

class Result {
    static void checkMarks(int marks) throws InvalidMarksException {
        // Throw new InvalidMarksException if marks < 0 or marks > 100.
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        // Otherwise print Marks accepted.
        System.out.println("Marks accepted");

    }

}

public class Implement_invalid_marks_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // Call Result. checkMarks(marks) inside try.
        try {
            Result.checkMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        // Catch InvalidMarksException and print Rejected: + message.
    }
}