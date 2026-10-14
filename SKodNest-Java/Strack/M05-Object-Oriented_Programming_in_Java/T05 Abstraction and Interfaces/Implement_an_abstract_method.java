import java.util.Scanner;

abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    String brand;

    Bike(String brand) {
        // Store the brand
        this.brand = brand;
    }

    @Override
    void start() {
        // Print the required output
        System.out.println(brand + " bike started");
    }
}

public class Implement_an_abstract_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();
        // Create Vehicle reference and call start()

        Vehicle vehicle = new Bike(brand);
        vehicle.start();
    }
}