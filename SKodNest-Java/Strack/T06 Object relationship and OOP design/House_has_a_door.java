import java.util.Scanner;

class Door {
    // Add material field, constructor and getter
    private String material;

    public Door(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

class House {
    // Create and store Door internally
    private Door door;

    public House(String material) {
        this.door = new Door(material);
    }

    public void displayDoor() {
        System.out.println("House has a " + door.getMaterial() + " door");
    }
}

public class House_has_a_door {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String material = scanner.nextLine();

        // Create House and show its door
        House h = new House(material);
        h.displayDoor();
    }
}