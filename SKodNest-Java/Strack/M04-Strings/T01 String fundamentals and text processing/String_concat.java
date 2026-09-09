public class String_concat {
    public static void main(String[] args) {
        String str1 = "Raja";
        String str2 = "Rani";
        String str3 = str1 + str2;
        System.out.println(str3);

        String t1 = new String("Anu");
        String t2 = new String("Banu");
        String res = t1.concat(t2);
        System.out.println(res);
    }
}
