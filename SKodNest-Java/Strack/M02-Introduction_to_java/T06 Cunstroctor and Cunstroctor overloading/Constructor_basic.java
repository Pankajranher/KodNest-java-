class StudentA {
    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}

public class Constructor_basic {
    public static void main(String[] args) {
        StudentA s1 = new StudentA();
        s1.input("Pankaj", 20, 5.11);
        s1.display();

    }
}
