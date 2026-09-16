import java.util.Scanner;

class Student {
    static int count;

    Student() {
        // Increase the shared count.
        count++;
    }
}

class Count_created_objects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        // Create the required objects and display Student. count.
        for (int i = 0; i < numberOfStudents; i++) {
            new Student();
        }
        System.out.println("Created students: " + Student.count);
    }
}