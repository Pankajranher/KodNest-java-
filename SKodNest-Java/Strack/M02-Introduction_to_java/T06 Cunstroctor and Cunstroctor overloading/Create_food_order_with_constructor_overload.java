
import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ",Quantity: " + quantity);
    }
}

public class Create_food_order_with_constructor_overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // Create one order with the first constructor
        FoodOrder fd1 = new FoodOrder(item);

        // Create one order with the second constructor
        FoodOrder fd2 = new FoodOrder(item, quantity);

        // Display both orders
        fd1.display();
        fd2.display();
    }
}