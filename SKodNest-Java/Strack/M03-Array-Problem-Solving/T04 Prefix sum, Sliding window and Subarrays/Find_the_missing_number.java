import java.util.Scanner;

class Find_the_missing_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];

        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            actualSum += arr[i];
        }

        long expectSum = ((long) n * (n + 1)) / 2;
        long missNum = expectSum - actualSum;
        System.out.println(missNum);
    }
}
