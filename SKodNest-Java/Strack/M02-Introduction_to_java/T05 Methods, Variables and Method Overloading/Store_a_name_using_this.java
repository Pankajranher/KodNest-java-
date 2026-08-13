import java.util.Scanner;

class StudentC {
    String name;

    void setName(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void displayName() {
        // Print the stored name
        System.out.println("Student Name: " + name);
    }
}

class Store_a_name_using_this {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name
        String name = scanner.nextLine();

        // Create one Student object
        StudentC std = new StudentC();

        // Call setName() and displayName()
        std.setName(name);
        std.displayName();
    }
}