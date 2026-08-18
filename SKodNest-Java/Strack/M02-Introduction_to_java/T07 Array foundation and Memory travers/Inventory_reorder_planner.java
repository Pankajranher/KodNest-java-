
public class Inventory_reorder_planner {
    public static void main(String[] args) {
        // Write your code here.
        int[] stock = { 4, 12, 2, 9, 5 };
        int recorderLevel = 5;

        int recordCount = 0;
        for (int i = 0; i <= stock.length - 1; i++) {
            if (stock[i] <= recorderLevel) {
                recordCount += 1;
            }
        }
        System.out.println("Items to reorder: " + recordCount);
    }
}