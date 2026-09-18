import java.util.Scanner;

class Student {
    String name;
    static int count;

    Student(String name) {
        // Store the name and increase the count.
        this.name = name;
        count++;
    }
}

public class Create_two_students_and_count_them {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two names, create two objects and display the result.
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        Student st1 = new Student(s1);
        Student st2 = new Student(s2);

        System.out.println("Student: " + st1.name);
        System.out.println("Student: " + st2.name);
        System.out.println("Total students: " + st1.count);
    }
}