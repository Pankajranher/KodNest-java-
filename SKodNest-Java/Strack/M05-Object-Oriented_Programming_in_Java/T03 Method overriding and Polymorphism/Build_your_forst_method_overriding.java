import java.util.Scanner;

class Animal {
    public void makeSound(String sound) {
        System.out.println("Animal " + sound);
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(String sound) {
        System.out.println("Dog " + sound);
    }
}

public class Build_your_forst_method_overriding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sound = scanner.next();

        Dog dog = new Dog();
        dog.makeSound(sound);
    }
}