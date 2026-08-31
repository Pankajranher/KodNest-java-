import java.util.Scanner;

public class Find_longest_contineous_increasing_segment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int longest = 1;

        // Changed i = 0 to i = 1 to prevent arr[-1] error
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
                if (count > longest) {
                    longest = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(longest);
    }
}
