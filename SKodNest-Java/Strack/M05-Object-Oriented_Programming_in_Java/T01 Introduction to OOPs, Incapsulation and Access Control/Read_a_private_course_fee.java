import java.util.Scanner;

class Course {
    private double fee;

    Course(double fee) {
        // Store fee
        this.fee = fee;
    }

    // Create getFee()
    public double getFee() {
        return fee;
    }
}

public class Read_a_private_course_fee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        double courseFee = scanner.nextDouble();

        Course C = new Course(courseFee);
        System.out.println(C.getFee());
    }
}