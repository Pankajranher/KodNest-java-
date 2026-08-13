import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void setDetails(String name, double salary) {
        // Store both parameters in the instance variables
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Employee_details_with_variable_shodowing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and salary
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        scanner.nextLine();

        // Create one Employee object
        Employee emp = new Employee();

        // Call setDetails() and displayDetails()
        emp.setDetails(name, salary);
        emp.displayDetails();
    }
}