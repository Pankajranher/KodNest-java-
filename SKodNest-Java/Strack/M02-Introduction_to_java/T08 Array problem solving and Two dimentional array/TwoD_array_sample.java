import java.util.Scanner;

public class TwoD_array_sample {
    public static void main(String[] args) {
        int a[][] = new int[3][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of array");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
