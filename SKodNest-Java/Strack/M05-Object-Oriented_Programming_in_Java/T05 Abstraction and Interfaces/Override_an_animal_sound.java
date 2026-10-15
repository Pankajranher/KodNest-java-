import java.util.Scanner;

abstract class Animal {
    abstract void sound();

}

class Dog extends Animal {
    // Add name, constructor and sound()
    String name;

    Dog(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " says Woof");
    }
}

public class Override_an_animal_sound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Animal reference and call sound()
        Dog d = new Dog(name);
        Animal ref;
        ref = d;
        ref.sound();

    }
}