abstract class Vehicle {
    abstract void move();
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike moves");

    }

}

public class Build_your_first_abstract_class {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();

    }
}