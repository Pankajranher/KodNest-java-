public class method_overriding2 {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.eat();
        m.sleep();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();
    }

}

class Animal {
    void eat() {
        System.out.println("All animals eat........");
    }

    void sleep() {
        System.out.println("All animals sleep........");
    }
}

class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("The monkey steals and eat.......");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("The tiger hunts and eat......");
    }
}