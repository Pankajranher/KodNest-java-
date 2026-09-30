import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        // Store the name
        this.name = name;
    }

    public void displayWelcome() {
        // Print Welcome followed by the name
        System.out.println("Welcome " + name);
    }
}

class Employee extends Person {

}

public class Reuse_a_parent_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.next();
        // Create an Employee
        Employee emp = new Employee();
        // Call the inherited methods
        emp.setName(name);
        emp.displayWelcome();

    }
}