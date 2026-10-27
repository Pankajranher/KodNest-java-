import java.util.Scanner;

class Room {
    private String name;

    Room(String name) {
        // Initialize name
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class House {
    private Room room;

    House(String roomName) {
        // Create the Room here
        this.room = new Room(roomName);
    }

    void showRoom() {
        // Print the room
        System.out.println("House contains: " + room.getName());
    }
}

public class Build_a_house_with_room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roomName = scanner.nextLine();

        House house = new House(roomName);
        house.showRoom();
    }
}