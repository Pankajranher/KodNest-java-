import java.util.Scanner;

class Training {
    // Add final showInstitute()
    final void showInstitute() {
        System.out.println("KodNest");
    }
}

final class JavaTraining extends Training {
    // Add final courseCode, constructor and showCourse()
    final String code;

    JavaTraining(String code) {
        this.code = code;
    }

    public void showCourse(String code) {
        System.out.println("Course: " + code);
    }
}

public class Use_final_safely {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        // Create JavaTraining and display details
        Training tr = new Training();
        JavaTraining jt = new JavaTraining(code);

        tr.showInstitute();
        jt.showCourse(code);
    }
}