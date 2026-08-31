
import java.util.Scanner;

public class Find_value_closest_to_target {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int closest = arr[0];

        int diff = arr[0] - target;
        if (diff < 0) {
            diff = -diff;

            for (int i = 0; i < n; i++) {
                int currentdiff = arr[i] - target;
                if (currentdiff < 0) {
                    currentdiff = -currentdiff;
                }

                if (currentdiff < diff || currentdiff == diff && arr[i] < closest) {
                    diff = currentdiff;
                    closest = arr[i];
                }
            }
            System.out.println(closest);

        }
    }
}