import java.util.Scanner;

class Product {
    private double price;

    public boolean setPrice(double price) {
        // Validate and store
        if (price >= 0) {
            this.price = price;
            return true;
        }
        return false;
    }

    public double getPrice() {
        // Return price
        return price;
    }
}

public class Validate_a_product_price {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        float price = scanner.nextFloat();
        Product pr = new Product();
        // pr.setPrice(price);
        if (pr.setPrice(price)) {
            System.out.println(pr.getPrice());
        } else {
            System.out.println("Invalid price");
        }
    }
}