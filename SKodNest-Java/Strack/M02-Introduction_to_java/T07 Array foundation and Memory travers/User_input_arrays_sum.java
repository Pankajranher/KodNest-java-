import java.util.Scanner;

class User_input_arrays_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        System.out.println("Enter the arrays elements");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();

        }
        for (int j = 0; j < arr.length - 1; j++) {
            sum += arr[j];

        }
        System.out.print("Total Sum: " + sum);

    }
}