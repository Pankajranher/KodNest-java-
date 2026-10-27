class Engine {
    void start() {
        System.out.println("Engine started");

    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
    }
}

public class Build_a_car_with_engine {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);

        car.startCar();
    }
}