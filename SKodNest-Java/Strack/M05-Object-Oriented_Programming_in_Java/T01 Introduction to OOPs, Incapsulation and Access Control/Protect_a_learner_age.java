import java.util.Scanner;

class Learner {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void displayAge() {
        System.out.println(age);
    }
}

public class Protect_a_learner_age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Learner learner = new Learner();
        learner.setAge(age);
        learner.displayAge();
    }
}