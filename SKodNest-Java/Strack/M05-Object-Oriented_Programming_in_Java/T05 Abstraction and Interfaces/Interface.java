interface Shape {
    public abstract void input();

    public abstract void disp();
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("INPUT");
    }

    @Override
    public void disp() {
        System.out.println("DISP");
    }
}

public class Interface {
    public static void main(String arg[]) {
        Square s = new Square();
        s.input();
        s.disp();

        // Shape ref;

        // ref = s;
        // ref.disp();
        // ref.input();
    }
}
