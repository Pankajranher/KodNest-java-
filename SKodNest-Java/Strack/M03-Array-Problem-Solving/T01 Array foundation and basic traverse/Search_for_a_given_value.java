import java.util.Scanner;

public class Search_for_a_given_value {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                System.out.println(i);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println(-1);
        }
        scanner.close();
    }
}
