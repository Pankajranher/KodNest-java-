import java.util.Scanner;

class Animal {

}

class Dog extends Animal {
    public void fetch(String item) {
        // Print Fetch and item
        System.out.println("Fetch " + item);

    }
}

public class Access_a_dog_method_safely {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read item
        String item = scanner.next();

        // Store Dog in Animal reference
        Animal anm = new Dog();

        // Check, cast and call fetch()
        if (anm instanceof Dog) {
            Dog dog = (Dog) anm;
            dog.fetch(item);
        }
    }
}