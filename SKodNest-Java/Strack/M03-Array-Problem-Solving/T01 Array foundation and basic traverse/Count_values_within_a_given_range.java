import java.util.Scanner;

public class Count_values_within_a_given_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int lower = scanner.nextInt();
        int uper = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= lower && arr[i] <= uper) {
                count += 1;

            }
        }
        System.out.println(count);

    }

}
