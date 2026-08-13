import java.util.Scanner;

public class Interactive_learning_profile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        int solvedProblems = sc.nextInt();
        double assessmentPercentage = sc.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        sc.close();
    }
}