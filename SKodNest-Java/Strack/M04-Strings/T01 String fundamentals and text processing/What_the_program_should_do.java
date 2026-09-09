import java.util.Scanner;

public class What_the_program_should_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display the course and trainer names.
        String course_name = scanner.nextLine();
        String trainer_name = scanner.nextLine();

        System.out.println("Course: " + course_name);
        System.out.println("Trainer: " + trainer_name);

    }
}
