import java.util.Scanner;

class Employee {
    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {
    // Override displayRole()
    @Override
    public void displayRole(String role) {
        System.out.println("Developer " + role);
    }
}

public class Override_an_employee_role {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read role
        String role = scanner.next();

        // Create Developer
        Developer dev = new Developer();

        // Call displayRole()
        dev.displayRole(role);
    }
}