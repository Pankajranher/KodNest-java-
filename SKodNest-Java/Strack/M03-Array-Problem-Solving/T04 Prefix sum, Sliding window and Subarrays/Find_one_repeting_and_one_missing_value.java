import java.util.Scanner;

public class Find_one_repeting_and_one_missing_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeating = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        System.out.println(missing + " " + repeating);
    }
}
