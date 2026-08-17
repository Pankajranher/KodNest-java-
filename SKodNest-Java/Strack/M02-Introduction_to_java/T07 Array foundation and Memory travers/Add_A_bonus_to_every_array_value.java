public class Add_A_bonus_to_every_array_value {
    public static void main(String[] args) {
        // Write your code here.
        int[] values = { 10, 20, 30, 40, 50 };
        int bonus = 5;
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] += bonus;
        }

        System.out.print("Updated values: ");
        for (int j = 0; j <= values.length - 1; j++) {
            System.out.print(values[j] + " ");

        }
    }
}