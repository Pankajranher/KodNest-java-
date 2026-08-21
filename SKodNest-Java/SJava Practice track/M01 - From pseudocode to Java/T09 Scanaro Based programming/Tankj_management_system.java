import java.util.Scanner;

class WaterTank {
    // Declare capacity and currentLevel
    int capacity;
    int currentLevel;

    // Write the constructor
    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    // Write fillWater()
    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int actualAmount;

        if (amount <= availableSpace) {
            actualAmount = amount;
        } else {
            actualAmount = availableSpace;
        }

        currentLevel += actualAmount;
        return actualAmount;
    }

    // Write drainWater()
    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int actualAmount;
        if (amount <= currentLevel) {
            actualAmount = amount;
        } else {
            actualAmount = currentLevel;
        }

        currentLevel -= actualAmount;
        return actualAmount;
    }

    // Write getStatus()
    String getStatus() {

        if (currentLevel == 0) {
            return "Empty";
        }
        double fillPercentage = currentLevel * 100.0 / capacity;

        if (fillPercentage < 25) {
            return "Low";
        } else if (fillPercentage < 75) {
            return "Medium";
        } else if (fillPercentage < 100) {
            return "High";
        } else {
            return "Full";
        }
    }

    // Write displayTank()
    void displayTank() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + (capacity - currentLevel));
        System.out.println("Status: " + getStatus());
    }
}

public class Tankj_management_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read capacity, initial level and operation count
        int capacity = scanner.nextInt();
        int initialLevel = scanner.nextInt();
        int operations = scanner.nextInt();

        // Create the WaterTank object
        WaterTank wt = new WaterTank(capacity, initialLevel);

        // Process operations using a loop and switch
        for (int i = 0; i < operations; i++) {
            int choice = scanner.nextInt();

            //
            switch (choice) {
                case 1:
                    int fillAmount = scanner.nextInt();
                    int filled = wt.fillWater(fillAmount);
                    System.out.println("Operation " + (i + 1) + " - Filled: " + filled);
                    break;

                case 2:
                    int drainAmount = scanner.nextInt();
                    int drained = wt.drainWater(drainAmount);
                    System.out.println("Operation " + (i + 1) + " - Drained: " + drained);
                    break;

                case 3:
                    System.out.println("Operation " + (i + 1) + " - Tank Status");
                    wt.displayTank();
                    break;

                default:
                    System.out.println("Operation " + (i + 1) + " - Invalid Choice.");

            }
        }
        // Display the final tank status
        System.out.println("Final Tank Status");
        wt.displayTank();
        scanner.close();

    }

}