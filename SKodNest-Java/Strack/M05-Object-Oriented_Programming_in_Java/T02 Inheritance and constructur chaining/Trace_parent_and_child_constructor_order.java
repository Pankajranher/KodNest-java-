import java.util.Scanner;

class Person {
    Person(String name) {
        // Print the parent message
        System.out.println("Pers    on: " + name);
    }
}

class Student extends Person {
    Student(String name) {
        // Call the parent constructor
        super(name);
        // Print the child message
        System.out.println("Student created");
    }

}

public class Trace_parent_and_child_constructor_order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.next();

        // Create Student
        Student st = new Student(name);
    }
}