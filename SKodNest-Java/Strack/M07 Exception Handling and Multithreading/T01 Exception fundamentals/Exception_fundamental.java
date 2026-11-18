import java.util.Scanner;

public class Exception_fundamental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        float A = sc.nextFloat();

        System.out.println("Enter Value of B: ");
        float B = sc.nextFloat();

        float C = A / B;

        System.out.println("The answer is: " + C);

    }
}
