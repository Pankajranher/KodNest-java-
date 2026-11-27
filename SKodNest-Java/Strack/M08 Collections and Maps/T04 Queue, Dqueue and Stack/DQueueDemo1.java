import java.util.ArrayDeque;

public class DQueueDemo1 {
    public static void main(String args[]) {
        ArrayDeque dq1 = new ArrayDeque<>();
        dq1.add(34);
        dq1.add(54);
        dq1.add(30);
        dq1.add(80);
        dq1.add(20);
        dq1.add(55);
        System.out.println(dq1);
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());

    }
}
