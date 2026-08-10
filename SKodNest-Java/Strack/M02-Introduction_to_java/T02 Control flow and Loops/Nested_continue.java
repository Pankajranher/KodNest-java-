public class Nested_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    continue;
                }
                System.out.println("i: " + i + "  j: " + j);
            }
        }
    }
}
