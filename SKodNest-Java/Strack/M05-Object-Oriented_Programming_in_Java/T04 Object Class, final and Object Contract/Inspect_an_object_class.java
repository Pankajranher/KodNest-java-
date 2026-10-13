import java.util.Scanner;

class Course {
    String name;

    Course(String name) {
        this.name = name;
    }
}

public class Inspect_an_object_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        // Create Course and display runtime class and name
        Course c = new Course(name);
        System.out.println("Class: " + c.getClass().getSimpleName());
        System.out.println("Course: " + c.name);
        scanner.close();

    }
}