import java.util.Scanner;

class MethodDemo {
    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        return 7;
    }

    int add(int first, int second) {
        // Return the sum
        return first + second;
    }
}

class Use_the_four_simple_method_type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.next();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Create one object
        MethodDemo obj1 = new MethodDemo();
        scanner.close();

        // Call all four methods
        obj1.sayHello();
        obj1.greet(name);
        obj1.getLuckyNumber();
        obj1.add(num1, num2);

        System.out.println("Lucky Number: " + obj1.getLuckyNumber());
        System.out.println("Sum: " + obj1.add(num1, num2));
    }
}