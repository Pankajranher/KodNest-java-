public class Practice_report {
    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double reportValue = solvedProblems;
        int wholePercentage = (int) exactPercentage;
        double avaragePerDay = (double) solvedProblems / practiceDays;
        boolean dailyTargetReached = avaragePerDay <= 9.8;

        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + avaragePerDay);
        System.out.println("Daily Target Reached: " + dailyTargetReached);
    }
}
