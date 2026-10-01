import java.util.*;

public class Koko_eating_bananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = scanner.nextInt();
        }

        int h = scanner.nextInt();
        int result = minEatingSpeed(piles, h);
        System.out.println(result);
        scanner.close();
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // Write your code here
        int low = 1;
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;

            }

            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}