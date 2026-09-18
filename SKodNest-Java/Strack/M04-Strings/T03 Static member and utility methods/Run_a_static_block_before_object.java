
import java.util.Scanner;

class Course {
    static {
        // Print the initialization message.
        System.out.println("Course class initialized");
    }

    Course(String name) {
        // Print the created course.
        System.out.println("Created: " + name);

    }
}

public class Run_a_static_block_before_object {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one name and create one Course object.
        String course = scanner.nextLine();
        Course c1 = new Course(course);
    }
}