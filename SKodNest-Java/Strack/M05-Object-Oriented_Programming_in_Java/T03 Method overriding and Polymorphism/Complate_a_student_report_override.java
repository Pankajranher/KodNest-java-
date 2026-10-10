import java.util.Scanner;

class Report {
    public void display(String title) {
        System.out.println("Report " + title);
    }
}

class StudentReport extends Report {
    // Add the correct override
    @Override
    public void display(String title) {
        System.out.println("Student " + title);
    }
}

public class Complate_a_student_report_override {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read title
        String title = scanner.next();

        // Use Report reference
        Report rep;
        rep = new StudentReport();

        // Call display()
        rep.display(title);

    }
}