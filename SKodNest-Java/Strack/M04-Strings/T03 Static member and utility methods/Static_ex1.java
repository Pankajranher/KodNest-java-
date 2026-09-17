class Static_ex1 {
    public static void main(String[] args) {
        Car.convertKmtoMiles();
        Car nano = new Car();

        nano.calculateMilage();

        Car bmw = new Car();

        bmw.calculateMilage();
    }
}

class Car {
    static void convertKmtoMiles() {
        System.out.println("Converting KM to miles..................");
    }

    void calculateMilage() {
        System.out.println("Calculating milage for each car..................");
    }
}
