import java.util.Scanner;

final class StudentRecord {
    // Add private final fields, constructor and getters
    private final int id;
    private final String name;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getter(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Create_a_immutable_student_record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        // Create the immutable object and print its data
        final StudentRecord sr = new StudentRecord(id, name);
        sr.getter(id, name);
        scanner.close();
    }
}