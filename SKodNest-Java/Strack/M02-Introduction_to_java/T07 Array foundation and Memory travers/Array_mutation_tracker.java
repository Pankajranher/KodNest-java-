public class Array_mutation_tracker {
    public static void main(String[] args) {
        // Write your code here.
        int[] readings = { 12, 14, 16, 18 };
        int updateIndex = 2;
        int newValue = 25;

        int[] snapshot = new int[readings.length];
        for (int i = 0; i <= readings.length - 1; i++) {
            snapshot[i] = readings[i];
        }
        readings[updateIndex] = newValue;

        System.out.print("Snapshot: ");
        for (int snap : snapshot) {
            System.out.print(snap + " ");
        }
        System.out.println(" ");

        System.out.print("Updated: ");
        for (int read : readings) {
            System.out.print(read + " ");

        }
    }
}
