class Pr3 {
    public static void main(String[] args) {
        int a = 10;
        int res = a++ + ++a + a++ + a++ + ++a + a++;
        System.out.println(res);
    }
}