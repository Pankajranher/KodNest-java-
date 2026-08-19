import java.util.Scanner;

public class ThreeD_array_sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[2][2][3];
        System.out.println("Enter the array element");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                for (int k = 0; k <= a[i][j].length - 1; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("display the array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                for (int k = 0; k <= a[i][j].length - 1; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("=======================");
        }

    }
}
