import java.util.Scanner;

class Product {
    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Product: " + id + "- " + name;
    }
}

public class Display_product_details_with_toString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        // Create and print Product
        Product pr = new Product(id, name);
        System.out.println(pr);
        scanner.close();

    }
}