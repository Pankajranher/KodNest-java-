import java.util.Scanner;

class Printer {
    void print(String employee, String document) {
        // Print the result
        System.out.println(employee + " prints " + document);
    }
}

class Employee {
    private String name;

    Employee(String name) {
        // Initialize name
        this.name = name;
    }

    void printDocument(Printer printer, String document) {
        // Use the printer
        printer.print(this.name, document);
    }
}

public class Employee_uses_a_printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.nextLine();
        String document = scanner.nextLine();

        // Create both objects and connect them
        Employee employee = new Employee(employeeName);
        Printer printer = new Printer();

        employee.printDocument(printer, document);
    }
}