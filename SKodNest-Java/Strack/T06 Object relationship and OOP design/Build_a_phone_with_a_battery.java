import java.util.Scanner;

class Battery {

    private int percentage;

    Battery(int percentage) {
        // Initialize percentage
        this.percentage = percentage;
    }

    int getPercentage() {
        return percentage;
    }
}

class Phone {
    private String brand;
    private Battery battery;

    Phone(String brand, int percentage) {
        // Initialize brand and create Battery
        this.brand = brand;
        this.battery = new Battery(percentage);
    }

    void showStatus() {
        // Print the status
        System.out.println(this.brand + " battery: " + this.battery.getPercentage() + "%");
    }
}

public class Build_a_phone_with_a_battery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        int percentage = scanner.nextInt();

        Phone phone = new Phone(brand, percentage);
        phone.showStatus();
    }
}