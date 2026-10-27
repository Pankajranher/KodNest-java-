import java.util.Scanner;

class Coach {
    private String name;

    Coach(String name) {
        // Initialize name
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Team {
    private String name;
    private Coach coach;

    Team(String name, Coach coach) {
        // Initialize both fields
        this.name = name;
        this.coach = coach;
    }

    void showDetails() {
        // Print team and coach
        System.out.println("Team: " + name);
        System.out.println("Coach: " + coach.getName());
    }
}

public class Build_a_team_aggregation_model {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teamName = scanner.nextLine();
        String coachName = scanner.nextLine();

        // Create Coach first and pass it to Team

        Coach co = new Coach(coachName);
        Team t = new Team(teamName, co);

        t.showDetails();

    }
}