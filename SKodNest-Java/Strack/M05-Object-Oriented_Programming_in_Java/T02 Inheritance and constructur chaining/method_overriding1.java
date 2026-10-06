public class method_overriding1 {
    public static void main(String[] args) {
        child c = new child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}

class parent1 {
    void disp1() {
        System.out.println("Inside the parent disp1");
    }

    void disp2() {
        System.out.println("Inside the parent disp2");
    }

}

class child extends parent1 {
    @Override
    void disp2() {
        System.out.println("Inside Child disp");
    }

    void disp3() {
        System.out.println("inside child disp3");
        super.disp2();
    }

}
