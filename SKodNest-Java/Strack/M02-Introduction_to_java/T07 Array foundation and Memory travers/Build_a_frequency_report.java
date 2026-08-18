import java.util.Scanner;

class Build_a_frequency_report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count += 1;

            }

        }
        System.out.println("Frequency of " + target + ": " + count);

    }
}
