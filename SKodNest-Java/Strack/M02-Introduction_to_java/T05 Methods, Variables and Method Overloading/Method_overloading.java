public class Method_overloading {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        System.out.println(a1.add(10, 20));
        System.out.println(a1.add(10, 20.5));

    }
}

class Addition {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}
