class StudentB {
    String name;
    int age;
    double height;

    StudentB(String name, int age, double height) {
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

class Constructor_implementation {
    public static void main(String[] args) {
        StudentB s1 = new StudentB("Pankaj", 20, 5.11);
        s1.display();

    }
}
