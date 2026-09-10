public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Java");
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("is a programming language");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("and oject oriented");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
