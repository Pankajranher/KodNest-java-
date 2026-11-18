import java.util.Scanner;

public class Trace_a_failing_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();

        System.out.println("Program started");
        System.out.println("Before division");

        int answer = 12 / divisor;

        System.out.println("After division");
        System.out.println("Answer: " + answer);
        System.out.println("Program completed");

    }
}