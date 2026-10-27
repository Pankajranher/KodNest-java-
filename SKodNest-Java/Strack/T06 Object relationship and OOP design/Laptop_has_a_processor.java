import java.util.Scanner;

class Processor {
    // Add field, constructor and getter
    private String processorName;

    public Processor(String processorName) {
        this.processorName = processorName;
    }

    public String getProcessorName() {
        return processorName;
    }
}

class Laptop {
    // Add Laptop fields and create Processor internally
    private String brand;
    private Processor processor;

    public Laptop(String brand, String processorName) {
        this.brand = brand;
        this.processor = new Processor(processorName);
    }

    public void displayDetails() {
        System.out.println(this.brand + " uses " + this.processor.getProcessorName());
    }
}

public class Laptop_has_a_processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();
        String processorName = scanner.nextLine();

        // Create Laptop and display details
        Laptop laptop = new Laptop(brand, processorName);
        laptop.displayDetails();
    }
}