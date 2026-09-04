import java.util.Scanner;

public class Rotate_array_left_by_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long kLong = sc.nextLong();
        int k = (int) (kLong % n);

        if (k > 0) {
            int start1 = 0;
            int end1 = k - 1;
            while (start1 < end1) {
                int temp = arr[start1];
                arr[start1] = arr[end1];
                arr[end1] = temp;
                start1++;
                end1--;
            }

            int start2 = k;
            int end2 = n - 1;
            while (start2 < end2) {
                int temp = arr[start2];
                arr[start2] = arr[end2];
                arr[end2] = temp;
                start2++;
                end2--;
            }

            int start3 = 0;
            int end3 = n - 1;
            while (start3 < end3) {
                int temp = arr[start3];
                arr[start3] = arr[end3];
                arr[end3] = temp;
                start3++;
                end3--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
    }
}
