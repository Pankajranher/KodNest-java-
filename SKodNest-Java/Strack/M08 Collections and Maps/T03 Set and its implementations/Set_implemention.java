import java.util.TreeSet;

public class Set_implemention {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(10);
        ts.add(54);
        ts.add(53);
        ts.add(55);
        ts.add(47);
        ts.add(90);
        ts.add(40);
        ts.add(50);
        ts.add(60);
        System.out.println(ts);
        System.out.println(ts.headSet(75));
        System.out.println(ts.headSet(75, true));
        System.out.println(ts.tailSet(100));
        System.out.println(ts.tailSet(100, false));
        System.out.println(ts.higher(100));
        System.out.println(ts.higher(80));
        System.out.println(ts.higher(200));
        System.out.println(ts.higher(0));

        System.out.println(ts.lower(100));
        System.out.println(ts.lower(30));
        System.out.println(ts.lower(10));

        System.out.println(ts.ceiling(100));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.ceiling(200));

        System.out.println(ts.floor(25));
        System.out.println(ts.floor(70));
        System.out.println(ts.floor(20));

    }
}
