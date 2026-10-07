import java.util.Scanner;

class Vehicle {
    private String brand;

    Vehicle(String brand) {
        // Initialize brand
        this.brand = brand;

    }

    public String getBrand() {
        // Return brand
        return brand;
    }

}

class Car extends Vehicle {
    Car(String brand) {
        // Call the parent constructor
        super(brand);
    }
}

public class Call_a_parent_constructor_using_super {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        String brand = scanner.next();
        Car c = new Car(brand);
        System.out.println(c.getBrand());

    }
}