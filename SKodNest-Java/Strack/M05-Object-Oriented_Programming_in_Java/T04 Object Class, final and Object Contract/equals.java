class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void dispay() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class equals {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Pankaj");
        Student s2 = new Student(12, "Sagar");
        Student s3 = new Student(11, "pranav");

        s1.dispay();
        s2.dispay();
        s3.dispay();

        System.out.println(s1.equals(s2)); // false

        System.out.println(s1.equals(s3)); // false
    }

}