public class Calculate_total_and_avarage_of_marks {
    public static void main(String[] args) {
        // Write your code here.
        int[] marks = { 70, 80, 60, 90, 50 };
        int total = 0;
        for (int i = 0; i <= marks.length - 1; i++) {
            total += marks[i];

        }
        double avarage = total / 5;
        System.out.println("Total: " + total);
        System.out.println("Average: " + avarage);

    }
}
