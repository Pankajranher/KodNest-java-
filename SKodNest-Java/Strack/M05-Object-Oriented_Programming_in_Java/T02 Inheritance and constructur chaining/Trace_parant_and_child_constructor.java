import java.util.Scanner;

class Parent {
    Parent(String value) {
        // Print Parent and value
        System.out.println("Parent " + value);

    }
}

class Child extends Parent {
    Child(String value) {
        // Call parent
        super(value);
        // Print Child
        System.out.println("Child");
    }
}

public class Trace_parant_and_child_constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and create Child
        String value = scanner.next();
        Child c = new Child(value);

    }
}