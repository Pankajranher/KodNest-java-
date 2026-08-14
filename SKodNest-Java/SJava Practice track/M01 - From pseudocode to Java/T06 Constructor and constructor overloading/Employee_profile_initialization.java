import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void displayProfile() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);

    }
}

public class Employee_profile_initialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        String employeeName = scanner.nextLine();
        String employeeDepartment = scanner.nextLine();

        Employee emp = new Employee(employeeId, employeeName, employeeDepartment);
        emp.displayProfile();
    }
}