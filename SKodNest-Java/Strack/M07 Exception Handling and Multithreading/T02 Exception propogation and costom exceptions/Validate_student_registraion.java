import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Registration {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Registration approved");

    }
}

public class Validate_student_registraion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            Registration.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        System.out.println("Completed");

    }
}