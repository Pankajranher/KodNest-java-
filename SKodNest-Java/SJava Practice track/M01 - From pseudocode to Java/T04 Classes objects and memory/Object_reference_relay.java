import java.util.Scanner;

class PracticeTask {
    // Declare id
    int id;
}

public class Object_reference_relay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three different PracticeTask objects and read their IDs
        PracticeTask Pt1 = new PracticeTask();
        Pt1.id = scanner.nextInt();

        PracticeTask Pt2 = new PracticeTask();
        Pt2.id = scanner.nextInt();

        PracticeTask Pt3 = new PracticeTask();
        Pt3.id = scanner.nextInt();

        // Preserve the first ID as a primitive int
        int unreachable = Pt1.id;

        // Create relay and perform the five reference assignments in order
        PracticeTask first = Pt1;
        PracticeTask second = Pt2;
        PracticeTask third = Pt3;
        PracticeTask relay = first;

        first = second;
        second = third;
        third = first;
        relay = second;

        // Print the final IDs reached by all four references
        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);

        // Print the ID of the unreachable object
        System.out.println("Unreachable Object: " + unreachable);
    }
}