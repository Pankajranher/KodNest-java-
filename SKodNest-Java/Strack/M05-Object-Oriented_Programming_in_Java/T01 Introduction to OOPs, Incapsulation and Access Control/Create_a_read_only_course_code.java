import java.util.Scanner;

class Course {
    private String courseCode;

    Course(String courseCode) {
        // Store courseCode
        this.courseCode = courseCode;

    }

    // Create only a getter
    public void getCourseCode() {
        System.out.println(courseCode);

    }
}

public class Create_a_read_only_course_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String course = scanner.next();
        Course c = new Course(course);
        c.getCourseCode();

    }
}