import java.util.Scanner;

public class Managenig_exce_locally {

    public static void main(String args[]) {

        System.out.println("Main method Execution Started ..... ");
        divide();
        System.out.println("Main method Execution Completed ..... ");
    }

    static void divide() {

        try {

            System.out.println("Division started");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a:");
            int a = scan.nextInt();
            System.out.println("Enter b:");

            int b = scan.nextInt();
            int res = a / b;
            System.out.println(res);
        } catch (Exception e) {

            System.out.println("Exception handled in divide Method");
        }
        System.out.println("Division completed");

    }
}
