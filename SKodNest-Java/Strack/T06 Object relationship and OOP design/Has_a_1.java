class OS {
    OS() {
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS is Still Executing");
    }
}

class Mobile {
    OS o = new OS();

    Mobile() {
        System.out.println("Mobile Created with os");
    }
}

public class Has_a_1 {
    public static void Main(String[] args) {
        Mobile m;
        m = new Mobile();
        m.o.checkOS();

        m = null;
        // m.checkOS(); // Exception
    }
}
