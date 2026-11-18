import java.util.Scanner;

public class Safely_read_an_array_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int[] data = { 5, 15, 25 };
        // Attempt array access and handle invalid indexes.
        try {
            System.out.println("Element: " + data[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found");
        }
    }

}