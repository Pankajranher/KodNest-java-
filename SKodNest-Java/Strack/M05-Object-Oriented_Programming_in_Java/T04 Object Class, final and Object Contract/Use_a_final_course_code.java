import java.util.Scanner;

class Course {
    // Add private final courseCode,
    private final String code;

    // constructor and display method
    Course(String code) {
        this.code = code;
    }

    public void display(String code) {
        System.out.println("Course: " + code);
    }
}

public class Use_a_final_course_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        // Create Course and display the code
        Course c = new Course(code);
        c.display(code);
        scanner.close();
    }
}