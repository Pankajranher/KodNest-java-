import java.util.Objects;

class Student {
    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class StudentApp {
    public static void main(String[] args) {

        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(11, "Raju");
        Student s3 = new Student(12, "Arjun");

        Object s4 = new Student(22, "Ravi");

        System.out.println(s1.getClass());
        System.out.println(s4.getClass());
    }

}
