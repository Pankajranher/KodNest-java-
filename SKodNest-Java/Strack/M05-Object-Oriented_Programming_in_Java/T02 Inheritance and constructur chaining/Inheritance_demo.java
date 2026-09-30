class Demo1 {
    int a = 1;

    void disp1() {
        System.out.println("demo " + a);
    }
}

class Demo2 extends Demo1 {

}

public class Inheritance_demo {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.disp1();
    }

}
