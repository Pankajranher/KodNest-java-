import java.util.Scanner;

public class Cascading_shift_after_mixed_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();

        String fullName = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();

    }
}
