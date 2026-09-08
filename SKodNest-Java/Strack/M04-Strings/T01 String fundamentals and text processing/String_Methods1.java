public class String_Methods1 {
    public static void main(String[] args) {
        String str = "Kodnest Technologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.contains("Kodnest"));
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("kod"));
        System.out.println(str.startsWith("nest"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("kod"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));

    }
}
