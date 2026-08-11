class employee {
    int id;
    String name;

    void work() {
        System.out.println("Working");
    }
}

class Emp_application {
    public static void main(String[] args) {
        employee e1 = new employee();

        e1.id = 11;
        e1.name = "Pankaj";

        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.work();

        employee e2;
        e2 = e1;
        e2.id = 12;
        e2.name = "Sushant";

        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

        e2.work();

    }
}
