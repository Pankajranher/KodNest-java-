public class String_toArray {
    public static void main(String[] args) {
        String str = "JAVA";
        char[] res = str.toCharArray();
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        String res2 = new String(res);
        System.out.println(res2);
    }
}
