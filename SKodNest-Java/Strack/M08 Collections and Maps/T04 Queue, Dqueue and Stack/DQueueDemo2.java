import java.util.ArrayDeque;

public class DQueueDemo2 {
    public static void main(String[] args) {
        ArrayDeque dq2 = new ArrayDeque<>();
        dq2.add("Anu");
        dq2.add("Pooja");

        dq2.add("Shalu");
        dq2.add("Raja");
        dq2.add("Pankaj");
        System.out.println(dq2);
        while (!dq2.isEmpty()) {
            System.out.println(dq2.poll());

        }
        System.out.println(dq2);

    }
}
