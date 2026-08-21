import java.util.Scanner;

public class Array_problem_solving_cheakpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }

        int row = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int matTotal = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matTotal += matrix[i][j];
            }
        }
        System.out.println("Array total: " + total);
        System.out.println("Matrix total: " + matTotal);
    }
}