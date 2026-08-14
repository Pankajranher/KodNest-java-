import java.util.Scanner;

class Student {
    String name;
    String courseName;
    int completedTopics;
    int questionsSolved;

    void setDetails(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    void setProgress(int completedTopics, int questionsSolved) {
        this.completedTopics = completedTopics;
        this.questionsSolved = questionsSolved;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Course Name: " + courseName);
    }

    void displayProgress() {
        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Questions Solved: " + questionsSolved);
    }

    void addTopics(int newCompletedTopics) {
        this.completedTopics += newCompletedTopics;
    }

    void addQuestions(int newQuestionsSolved) {
        this.questionsSolved += newQuestionsSolved;
    }

}

class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("        STUDENT PRACTICE TRACKER");
        System.out.println("===========================================");

        Student std1 = new Student();

        System.out.println("Enter the student name");
        String name = sc.nextLine();

        System.out.println("Enter the course name");
        String courseName = sc.nextLine();

        System.out.println("Enter the completed topics");
        int completedTopics = sc.nextInt();

        System.out.println("Enter questions solved");
        int questionsSolved = sc.nextInt();

        std1.setDetails(name, courseName);
        std1.setProgress(completedTopics, questionsSolved);

        while (true) {
            System.out.println("===========================================");
            System.out.println("                  MENUE                    ");
            System.out.println("===========================================");

            System.out.println("1. Display Details");
            System.out.println("2. Display Progress");
            System.out.println("3. Update Details");
            System.out.println("4. Update Progress");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    std1.displayDetails();
                    break;
                case 2:
                    std1.displayProgress();
                    break;
                case 3:
                    System.out.println("Enter the new name");
                    String newName = sc.nextLine();
                    System.out.println("Enter the new course name");
                    String newCourseName = sc.nextLine();
                    std1.setDetails(newName, newCourseName);
                    break;
                case 4:
                    System.out.println("Enter the new completed topics");
                    int newCompletedTopics = sc.nextInt();
                    System.out.println("Enter the new questions solved");
                    int newQuestionsSolved = sc.nextInt();
                    std1.setProgress(newCompletedTopics, newQuestionsSolved);
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");

            }

        }
    }
}
