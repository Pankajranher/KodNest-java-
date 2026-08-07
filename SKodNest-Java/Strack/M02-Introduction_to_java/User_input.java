import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Byte value");
        byte a = sc.nextByte();
        System.out.println("Byte value: " + a);

        System.out.print("Enter Short value");
        short b = sc.nextShort();
        System.out.println("Short value: " + b);

        System.out.println("Enter int value");
        int c = sc.nextInt();
        System.out.println("Int value: " + c);

        System.out.println("Enter Long value");
        long d = sc.nextLong();
        System.out.println("Long value: " + d);

        System.out.println("Enter Float value");
        float e = sc.nextFloat();
        System.out.println("Float value: " + e);

        System.out.println("Enter Double value");
        double f = sc.nextDouble();
        System.out.println("Double value: " + f);

        System.out.println("Enter Boolean value");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean value: " + g);

        System.out.println("Enter String value");
        String h = sc.next();
        System.out.println("String value: " + h);
    }
}
