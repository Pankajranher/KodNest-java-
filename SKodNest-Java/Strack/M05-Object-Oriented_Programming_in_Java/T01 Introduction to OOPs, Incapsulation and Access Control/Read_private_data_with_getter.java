import java.util.Scanner;

class Product {
    private double price;

    Product(double price) {
        // Store the value
        this.price = price;
    }

    // Create getPrice()
    public double getPrice() {
        return price;

    }

    public class Read_private_data_with_getter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read price
            float price = scanner.nextFloat();
            // Create Product
            Product pr = new Product(price);
            // Print the price through the getter
            System.out.println(pr.getPrice());

        }
    }
}