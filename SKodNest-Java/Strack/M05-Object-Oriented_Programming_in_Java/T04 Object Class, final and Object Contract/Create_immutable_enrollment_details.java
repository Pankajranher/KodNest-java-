import java.util.Scanner;

final class Enrollment {
    // Add private final fields
    private final int id;
    private final String course;

    // constructor and getters
    Enrollment(int id, String course) {
        this.id = id;
        this.course = course;
    }

    public void getter(int id, String course) {
        System.out.println("Enrollment: " + id);
        System.out.println("Course: " + course);

    }
}

public class Create_immutable_enrollment_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String course = scanner.next();

        // Create Enrollment and display values
        Enrollment enm = new Enrollment(id, course);
        enm.getter(id, course);
        scanner.close();
    }
}