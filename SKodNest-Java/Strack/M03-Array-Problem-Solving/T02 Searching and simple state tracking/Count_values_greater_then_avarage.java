import java.util.Scanner;

public class Count_values_greater_then_avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double avarage;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int count = 0;
        avarage = sum / n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avarage) {
                count++;

            }
        }
        System.out.println(count);

    }

}
