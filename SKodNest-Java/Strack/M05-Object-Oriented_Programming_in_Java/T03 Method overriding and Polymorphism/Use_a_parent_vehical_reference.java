import java.util.Scanner;

class Vehicle {
    public void move(int speed) {
        System.out.println("Vehicle " + speed);
    }
}

class Car extends Vehicle {
    // Override move()
    @Override
    public void move(int speed) {
        System.out.println("Car " + speed);
    }
}

public class Use_a_parent_vehical_reference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program using a Vehicle reference
        int speed = scanner.nextInt();
        Car c = new Car();
        c.move(speed);
    }
}