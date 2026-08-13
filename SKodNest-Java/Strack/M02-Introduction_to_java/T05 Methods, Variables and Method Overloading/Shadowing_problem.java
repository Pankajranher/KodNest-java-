class Shadowing_problem {
    public static void main(String[] args) {
        StudentA s1 = new StudentA();
        s1.input("Raja", 18, 5.5);
        s1.display();
    }
}

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
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}