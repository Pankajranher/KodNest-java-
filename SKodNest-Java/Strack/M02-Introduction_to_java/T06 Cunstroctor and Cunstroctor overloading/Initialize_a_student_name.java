
import java.util.Scanner;

class StudentD {
    String name;

    StudentD(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);

    }
}

class Initialize_a_student_name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();

        // Create one Student object
        StudentD st = new StudentD(name);

        // Call display()
        st.display();

    }
}
