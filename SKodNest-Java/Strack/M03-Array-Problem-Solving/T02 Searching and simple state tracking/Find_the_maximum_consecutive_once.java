import java.util.Scanner;

public class Find_the_maximum_consecutive_once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        int count = 0;
        int longest = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > longest) {
                    longest = count;

                } else {
                    count = 0;

                }

            }
        }
        System.out.println(longest);

    }

}