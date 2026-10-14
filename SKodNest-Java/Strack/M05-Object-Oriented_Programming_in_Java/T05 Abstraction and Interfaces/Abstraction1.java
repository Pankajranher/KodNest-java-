abstract class Parent {
    abstract void display1();

    abstract void display2();
}

class Child1 extends Parent {

    @Override
    void display1() {
        System.out.println("Inside Child1 display1");
    }

    @Override
    void display2() {
        System.out.println("inside Child1 display2");
    }
}

class Child2 extends Parent {
    @Override
    void display1() {
        System.out.println("Inside Child2 display1");
    }

    @Override
    void display2() {
        System.out.println("inside Child2 display2");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        accessMethod(ch1);
        accessMethod(ch2);

    }

    static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();
    }
}