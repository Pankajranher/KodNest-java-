
import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are too young, still have time!");
    }
}

class DrivingLicence {
    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your AGE:");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        } else {
            System.out.println("Driving Licence will be issued");
        }
    }
}

public class Create_custome_exceptions {
    public static void main(String[] args) {

        DrivingLicence dl = new DrivingLicence();

        dl.takeUserAge();

        try {
            dl.verify();
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
