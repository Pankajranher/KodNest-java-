import java.util.ArrayList;
import java.util.Scanner;

public class Collection_all_methods {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(303));
        System.out.println(al.get(5));
        System.out.println(al.indexOf(40));
        System.out.println(al.isEmpty());
        System.out.println(al);
        al.add(100);
        System.out.println(al);
        al.add(600);
        System.out.println(al);
        System.out.println(al.indexOf(100));
        System.out.println(al.indexOf(20));
        al.remove(0);
        System.out.println(al);
        al.set(2, "Pankaj");
        System.out.println(al);
        al.add(2, 76);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(450);
        al2.add(451);
        al2.add(452);
        System.out.println(al2);

    }
}
