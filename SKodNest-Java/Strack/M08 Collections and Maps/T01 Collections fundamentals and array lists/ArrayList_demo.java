import java.util.ArrayList;
import java.util.Scanner;

class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList ai = new ArrayList<>();
        ai.add(10);
        ai.add(20);
        ai.add(30);
        ai.add(40);
        ai.add(10);
        ai.add(10);
        ai.add(10);
        ai.add(10);
        System.out.println(ai);

        ai.add("Raja");
        ai.add('r');
        ai.add(56);
        System.out.println(ai);

    }
};
