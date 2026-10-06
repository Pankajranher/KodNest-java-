import java.util.Scanner;

class Person {
    private String name;

    // Create setName()
    public String setName(String name) {
        this.name = name;
        return name;
    }

    // Create getName()
    public void getName() {
        System.out.println(name);
    }
}

class Employee extends Person {
}

public class Reuse_a_person_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String name = scanner.next();
        Employee emp = new Employee();
        emp.setName(name);
        emp.getName();
    }
}