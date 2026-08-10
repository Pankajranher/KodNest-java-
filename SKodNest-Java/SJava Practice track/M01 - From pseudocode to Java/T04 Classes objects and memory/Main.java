import java.util.Scanner;

class PracticeProfile {
    String name;
    int points;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int startingPoints = sc.nextInt();
        int boostPoints = sc.nextInt();
        int correctionPoints = sc.nextInt();

        // Create the live profile
        PracticeProfile live = new PracticeProfile();
        live.name = name;
        live.points = startingPoints;

        // Alias refers to the exact same object
        PracticeProfile alias = live;

        // Apply boost through alias
        alias.points += boostPoints;
        if (alias.points > 100) {
            alias.points = 100;
        }

        // Create an independent checkpoint before correction
        PracticeProfile checkpoint = new PracticeProfile();
        checkpoint.name = live.name;
        checkpoint.points = live.points;

        // Apply correction to live
        live.points -= correctionPoints;
        if (live.points < 0) {
            live.points = 0;
        }

        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);

        sc.close();
    }
}
