public class Placement_rediness {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Write your code here
        String message = (marks >= 60 && attendance >= 75)
                ? "Placement Ready"
                : "Continue Preparation";

        System.out.println(message);

        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}
