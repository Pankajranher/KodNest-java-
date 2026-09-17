import java.util.Scanner;

class Learner {
    String name;
    static String institute = "KodNest";

    Learner(String name) {
        // Store the learner name.
        this.name = name;
    }

    void displayName() {
        // Display the instance name.
        System.out.println("Learner: " + name);
    }

    static void displayInstitute() {
        // Display the static institute.
        System.out.println("Institute: " + institute);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a name and use the correct forms of access.
        String learnerName = scanner.nextLine();
        Learner l1 = new Learner(learnerName);
        l1.displayName();
        Learner.displayInstitute();
    }

}