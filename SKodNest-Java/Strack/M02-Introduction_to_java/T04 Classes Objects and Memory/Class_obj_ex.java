class Class_obj_ex {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 12;
        s1.name = "Pankaj";
        s1.height = 152;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);

        s1.run();
        s1.sleep();

        System.out.println(" ");

        Student s2 = new Student();
        s2.roll = 12;
        s2.name = "Pankaj";
        s2.height = 152;

        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);

        s2.run();
        s2.sleep();

    }
}

class Student {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}