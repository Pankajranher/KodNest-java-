import java.util.Scanner;

public class Monthely_sales_report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noProducts = scanner.nextInt();
        int noMonths = scanner.nextInt();
        // int salesValues = scanner.nextInt();

        int[][] sales = new int[noProducts][noMonths];
        for (int i = 0; i < noProducts; i++) {
            int productTotal = 0;
            for (int j = 0; j < noMonths; j++) {
                int productSales = scanner.nextInt();
                sales[i][j] = productSales;
                productTotal += productSales;
            }
            System.out.println("Product " + (i + 1) + " total:" + productTotal);
        }
    }
}
