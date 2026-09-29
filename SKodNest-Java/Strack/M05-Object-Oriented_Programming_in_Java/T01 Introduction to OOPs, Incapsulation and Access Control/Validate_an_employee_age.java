import java.util.Scanner;

class Employee {
    private int age;

    public boolean setAge(int age) {
        // Validate and store age
        if (age > 10 && age < 60) {
            this.age = age;
        }
        return false;
    }

    public int getAge() {
        // Return the stored age
        return age;
    }
}

public class Validate_an_employee_age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read age and attempt the update
        int age = scanner.nextInt();
        Employee emp = new Employee();
        emp.setAge(age);

        if (emp.getAge() >= 18) {
            System.out.println(emp.getAge());
        } else {
            System.out.println("Invalid age");
        }
    }
}