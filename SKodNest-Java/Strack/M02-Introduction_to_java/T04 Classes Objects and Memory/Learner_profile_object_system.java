import java.util.Scanner;

class Learner {
    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;

    public class Learner_profile_object_system {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create and populate the first Learner object
            Learner firstLearner = new Learner();
            firstLearner.id = scanner.nextInt();
            firstLearner.name = scanner.next();
            firstLearner.javaScore = scanner.nextInt();

            // Create and populate the second Learner object
            Learner secondLearner = new Learner();
            secondLearner.id = scanner.nextInt();
            secondLearner.name = scanner.next();
            secondLearner.javaScore = scanner.nextInt();

            // Read the new score
            int newScore = scanner.nextInt();

            // Display both records before the update
            System.out.println("Before Update");
            System.out.println(firstLearner.id + " " + firstLearner.name + " - " + firstLearner.javaScore);
            System.out.println(secondLearner.id + " " + secondLearner.name + " - " + secondLearner.javaScore);

            // Update only the first object
            firstLearner.javaScore = newScore;

            // Display both records after the update
            System.out.println("After Update");
            System.out.println(firstLearner.id + " " + firstLearner.name + " - " + firstLearner.javaScore);
            System.out.println(secondLearner.id + " " + secondLearner.name + " - " + secondLearner.javaScore);
            scanner.close();
        }
    }
}
