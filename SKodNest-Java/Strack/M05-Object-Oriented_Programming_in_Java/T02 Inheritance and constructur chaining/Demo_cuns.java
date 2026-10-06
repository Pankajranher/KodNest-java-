public class Demo_cuns {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.disp2();
    }
}

class parent {
    int a = 10;
}

class Child extends parent {
    int a = 20;

    void disp2() {
        System.out.println("Inside child class method child" + super.a);
        System.out.println("A: " + a);
    }
}