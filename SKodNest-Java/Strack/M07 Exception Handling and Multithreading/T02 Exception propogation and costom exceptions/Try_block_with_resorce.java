import java.util.Scanner;

public class Try_block_with_resorce {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter a:");
            int a = scan.nextInt();
            System.out.println("Entered number is : " + a);
        }

    }
}