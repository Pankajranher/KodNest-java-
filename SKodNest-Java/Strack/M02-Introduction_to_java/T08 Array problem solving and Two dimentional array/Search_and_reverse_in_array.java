import java.util.Scanner;

public class Search_and_reverse_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.print("Reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}