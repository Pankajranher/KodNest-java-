import java.util.Scanner;

public class Replace_matching_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read target and replacement
        int targetValue = scanner.nextInt();
        int replacementValue = scanner.nextInt();

        int count = 0;

        // Replace matches, count changes and display the result
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == targetValue) {
                numbers[i] = replacementValue;
                count += 1;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}