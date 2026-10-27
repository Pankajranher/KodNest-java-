
class OS {
    OS() {
        System.out.println("OS is Installeed");
    }

    void checkOS() {
        System.out.println("OS is still executing");
    }
}

class Charger {
    Charger() {
        System.out.println("Charger Created");
    }

    void getCharger() {
        System.out.println("Charger can be used for charging");
    }
}

class Mobile {
    OS o = new OS();

    Mobile() {
        System.out.println("Mobile created with OS");
    }

    void hasA(Charger c) {
        System.out.println("Charger required");
    }
}

public class Has_a_2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Mobile m;
        m = new Mobile();

        Charger c;
        c = new Charger();

        m.hasA(c);

        c.getCharger();

        m = null;
        m.o.checkOS();
        c.getCharger(); // exception Os get destroyed
    }
}