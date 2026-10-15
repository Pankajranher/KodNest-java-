import java.util.Scanner;

abstract class Course {
    private String name;

    Course(String name) {
        // Store name
        this.name = name;
    }

    void showCourse() {
        // Print course
        System.out.println("Course: " + name);
    }
}

class JavaCourse extends Course {
    // Complete constructor
    String name;

    JavaCourse(String name) {
        super(name);
    }
}

public class Reuse_an_abstract_class_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create object and call showCourse()

        JavaCourse jc = new JavaCourse(name);
        jc.showCourse();
    }
}