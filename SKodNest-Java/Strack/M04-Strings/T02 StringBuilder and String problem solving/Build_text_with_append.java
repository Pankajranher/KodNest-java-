import java.util.Scanner;

public class Build_text_with_append {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        // Append the labels and values.
        builder.append("Learner: ");
        builder.append(learnerName);
        builder.append(" | ");
        builder.append("Course: ");
        builder.append(courseName);

        System.out.println(builder);
    }
}