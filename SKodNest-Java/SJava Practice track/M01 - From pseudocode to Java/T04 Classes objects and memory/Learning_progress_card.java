import java.util.Scanner;

class StudentProgress {
    String name;
    int completedLessons;
    int totalLessons;
    int percentage;

}

public class Learning_progress_card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one StudentProgress object
        StudentProgress student = new StudentProgress();

        // Read and store name, completed lessions and total lessiond
        student.name = scanner.next();
        student.completedLessons = scanner.nextInt();
        student.totalLessons = scanner.nextInt();

        // Calculate and store the completion percentage
        student.percentage = student.completedLessons * 100 / student.totalLessons;

        // Print the progress card
        System.out.println("Student: " + student.name);
        System.out.println("Progress: " + student.completedLessons + "/" + student.totalLessons);
        System.out.println("Completion: " + student.percentage + "%");

    }
}
