class StudentC {
    String name;
    int age;
    double height;

    StudentC() {
        name = "Anu";
        age = 18;
        height = 5.3;
    }

    StudentC(String name) {
        this.name = name;
    }

    StudentC(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class Student_applic_using_construction {
    public static void main(String[] args) {
        StudentC s2 = new StudentC();
        s2.display();

        StudentC s3 = new StudentC("Pankaj");
        s3.display();

        StudentC s1 = new StudentC("Sagar", 21, 5.9);
        s1.display();
    }
}
