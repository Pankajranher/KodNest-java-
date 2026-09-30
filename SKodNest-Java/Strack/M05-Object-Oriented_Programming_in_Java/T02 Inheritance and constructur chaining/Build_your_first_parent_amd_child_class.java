import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        this.name = name;

    }

    public void displayName() {
        System.out.println(name);

    }

}

class Student extends Person {

}

public class Build_your_first_parent_amd_child_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        Student student = new Student();
        student.setName(name);
        student.displayName();

    }
}