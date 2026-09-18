import java.util.Scanner;

class Learner {
    String learnerName;
    static String instituteName;

    Learner(String learnerName) {
        // Store the object-specific name.
        this.learnerName = learnerName;
    }

    void display() {
        // Display the name and shared institute.
        System.out.println(learnerName + " _ " + instituteName);
    }
}

public class Share_one_institute_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the shared institute and two names names.
        String instName = scanner.nextLine();
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        // Create and display two learners.
        Learner l1 = new Learner(name1);
        Learner l2 = new Learner(name2);
        Learner.instituteName = instName;
        l1.display();
        l2.display();
    }
}