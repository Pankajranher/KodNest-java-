import java.util.Scanner;

public class Managening_exce_localy1 {

    public static void main(String args[]) {

        System.out.println("Main method Execution Started ..... ");
        try {

            divide();
        } catch (Exception e) {

            System.out.println("Exception handled in Main");
        }
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
            throw e;
        } finally {
            System.out.println("Division completed");
        }
    }
}