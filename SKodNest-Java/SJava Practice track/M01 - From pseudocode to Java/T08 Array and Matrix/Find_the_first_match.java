import java.util.Scanner;

class Find_the_first_match {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Read the array
        // int size = scanner.nextInt();
        // scanner.nextLine();

        // Read the target
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Find and display the first matching index
        int target = scanner.nextInt();

        int found = -1;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == target) {
                found = i;
                break;
            }
        }
        System.out.println("First index: " + found);
    }
}
