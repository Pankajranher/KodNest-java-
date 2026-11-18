import java.util.Scanner;

public class Ducking_excp1 {

    public static void main(String args[]) {

        System.out.println("Main method Execution Started ..... ");

        try {
            divide();
        } catch (Exception e) {

            System.out.println("Exception handled in main");
        }

        System.out.println("Main method Execution Completed ..... ");

    }

    static void divide() throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scan.nextInt();
        System.out.println("Enter b:");
        int b = scan.nextInt();
        int res = a / b;
        System.out.println(res);

    }
}