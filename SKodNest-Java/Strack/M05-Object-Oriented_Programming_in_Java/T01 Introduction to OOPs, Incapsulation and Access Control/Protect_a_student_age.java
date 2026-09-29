import java.util.Scanner;

class Student {
    private int age;

    // Create setAge()
    public int setAge(int age) {
        this.age = age;
        return age;
    }

    // Create displayAge()
    public int display() {
        return age;
    }
}

public class Protect_a_student_age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        int age = scanner.nextInt();
        Student s1 = new Student();
        s1.setAge(age);
        System.out.println(s1.display());
    }
}