import java.util.ArrayDeque;

public class ArrayDqueue_demo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad);
        System.out.println(ad.peekLast());
        ad.add(30);
        System.out.println(ad);
        ad.offer(999);
        System.out.println(ad);
        ad.add(888);
        System.out.println(ad);
    }
}