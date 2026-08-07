public class Weekly_practice_plan_builder {
    public static void main(String[] args) {

        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        // Outer loop for days
        for (int i = 1; i <= practiceDays; i++) {

            // Skip revision day
            if (i == revisionDay) {
                continue;
            }

            // Inner loop for sessions
            for (int j = 1; j <= sessionsPerDay; j++) {

                // On the final day, allow only one session
                if (i == practiceDays && j > finalDaySessionLimit) {
                    break;
                }

                System.out.println("Day " + i + " - Session " + j);
                completedSessions++;
            }
        }

        // Print completed total
        System.out.println("Completed Sessions: " + completedSessions);

        // Print target status
        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        } else {
            System.out.println("Target Pending");
        }
    }
}