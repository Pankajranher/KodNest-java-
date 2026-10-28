import java.util.Scanner;

class Address {
    // Add city field, constructor and getter
    private String city;

    Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Student {
    // Store name and Address
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayLocation() {
        System.out.println(name + " lives in " + address.getCity());
    }
}

public class Student_has_an_address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        String city = scanner.nextLine();

        // Create Address first, then Student
        Address address = new Address(city);
        Student student = new Student(studentName, address);
        student.displayLocation();
    }
}