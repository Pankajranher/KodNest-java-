import java.util.Scanner;

public class Check_wether_two_arrays_identical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Arrays are identical");
        } else {
            System.out.println("Arrays are not identical");
        }
        scanner.close();
    }

}
