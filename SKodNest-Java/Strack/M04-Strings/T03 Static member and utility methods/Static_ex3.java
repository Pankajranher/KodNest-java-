class static_ex3 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

    }
}

class Demo {
    static {
        System.out.println("1st Static block got executed");
    }
    static {
        System.out.println("2nd     Static block got executed");
    }
    static {
        System.out.println("3rd     Static block got executed");
    }
    {
        System.out.println("1 st non static block got executed");

    }
    {
        System.out.println("2nd non static block got executed");

    }
    {
        System.out.println("3rd  non static block got executed");
    }
}