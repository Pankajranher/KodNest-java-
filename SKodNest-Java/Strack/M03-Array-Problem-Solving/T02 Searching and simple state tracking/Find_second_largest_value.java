import java.util.Scanner;

public class Find_second_largest_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("No second largest distinct value");
            return;
        }

        int large = arr[0];
        int secondLarge = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
                found = true;
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println(secondLarge);
        } else {
            System.out.println("No second largest distinct value");
        }
    }
}