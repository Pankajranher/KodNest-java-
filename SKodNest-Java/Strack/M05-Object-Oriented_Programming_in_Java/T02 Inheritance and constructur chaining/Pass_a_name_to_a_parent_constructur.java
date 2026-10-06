
import java.util.Scanner;

class Person {
    private String name;

    Person(String name) {
        // Initialize name
        this.name = name;
    }

    public String getName() {
        // Return name
        return name;
    }
}

class Student extends Person {
    private int marks;

    Student(String name, int marks) {
        // Call the parent constructor
        // Initialize marks
        super(name);
        this.marks = marks;
    }

    public void display() {
        // Print name and marks
        System.out.println(getName() + " " + " " + marks);
    }
}

public class Pass_a_name_to_a_parent_constructur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String name = scanner.next();
        int marks = scanner.nextInt();

        // Create Student
        Student st = new Student(name, marks);

        // Display values
        st.display();

    }
}