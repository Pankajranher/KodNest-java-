import java.util.Scanner;

class Attendance {
    private int presentDays;

    public void addDays(int days) {
        // Add only a positive value
        if (days > 0) {
            presentDays = days;
        }
    }

    public int getPresentDays() {
        // Return presentDays
        return presentDays;

    }
}

public class Add_attendence_days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        int day = scanner.nextInt();

        Attendance ats = new Attendance();
        ats.addDays(day);
        System.out.println(ats.getPresentDays());

    }
}
