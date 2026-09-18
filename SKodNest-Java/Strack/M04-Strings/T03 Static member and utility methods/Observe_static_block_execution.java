import java.util.Scanner;

class Demo {
    static {
        // Print the class-initialization message.
        System.out.println("Static block executed");

    }

    Demo() {
        // Print the constructor message.
        System.out.println("Constructor executed");
    }
}

class Observe_static_block_execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // Create count Demo objects.

        for (int i = 0; i < count; i++) {
            Demo d1 = new Demo();

        }
    }
}