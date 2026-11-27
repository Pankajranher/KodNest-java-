import java.util.ArrayDeque;

public class ArrayD_Demo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println(ad);
        ad.addFirst(99);
        ad.addFirst(88);
        ad.addFirst(77);
        System.out.println(ad);
        System.out.println(ad.remove());
        System.out.println(ad.removeFirst());
        System.out.println(ad);
        System.out.println(ad.removeLast());
        System.out.println(ad);
        System.out.println(ad.removeLast());
        System.out.println(ad);
        System.out.println(ad.poll());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);
        // System.out.println(ad.remove());//NoSuchElementException
        System.out.println(ad.poll());// null
    }
}