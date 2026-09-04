import java.util.Scanner;

public class Check_wether_an_array_is_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean pldrm = true;

        for (int j = 0; j < n / 2; j++) {
            if (arr[j] != arr[n - 1 - j]) {
                if (arr[j] != arr[n - 1 - j]) {
                    pldrm = false;
                    break;
                }
            }

            if (!pldrm) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}
