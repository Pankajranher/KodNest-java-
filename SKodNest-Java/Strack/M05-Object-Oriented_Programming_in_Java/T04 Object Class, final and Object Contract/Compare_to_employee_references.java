import java.util.Scanner;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }
}

public class Compare_to_employee_references {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create first, alias and second references
        Employee emp = new Employee(id);
        Employee alias = emp;

        Employee emp2 = new Employee(id);

        System.out.println(alias.equals(emp));
        System.out.println(emp2 == emp);
        scanner.close();
    }
}