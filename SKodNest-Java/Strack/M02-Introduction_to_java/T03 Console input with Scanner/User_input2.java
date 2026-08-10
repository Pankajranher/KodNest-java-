import java.util.Scanner;

public class User_input2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Age is: " + age);

        System.out.println("Enter your height");
        float height = sc.nextFloat();
        System.out.println("Height is: " + height);

        System.out.println("Enter your full name");
        String fname = sc.nextLine();
        System.out.println("Your name: " + fname);
    }
}
