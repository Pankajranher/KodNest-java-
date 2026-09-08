class String_pgm5 {
    public static void main(String[] arg) {
        String s1 = "java";
        String s2 = "java";

        if (s1 == s2) {
            System.out.println("Reference are same");
        } else {
            System.out.println("Reference are different");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are NOT same");
        }
    }
}
