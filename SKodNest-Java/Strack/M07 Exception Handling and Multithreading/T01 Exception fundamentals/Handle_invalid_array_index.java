import java.util.Scanner;

public class Handle_invalid_array_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] values = { 10, 20, 30, 40 };
        // Use try-catch to access values[index].

        try {
            System.out.println("Value: " + values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        // Print Access finished after try-catch.
        System.out.println("Access finished");

    }
}