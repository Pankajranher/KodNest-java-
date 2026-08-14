import java.util.Scanner;

class Employee {
    String name;
    String role;

    Employee() {
        this.role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Role: " + role);
    }
}

public class Empployee_default_role {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.nextLine();
        Employee emp = new Employee();
        emp.name = employeeName;
        emp.displayProfile();
    }
}