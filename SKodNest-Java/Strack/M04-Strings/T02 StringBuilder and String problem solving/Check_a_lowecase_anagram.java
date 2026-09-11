import java.util.Scanner;

public class Check_a_lowecase_anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        // Match and remove characters, then display the result.
        if (first.length() != second.length()) {
            System.out.println(false);
            return;
        }
        StringBuilder sb = new StringBuilder(second);
        boolean isAna = true;

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            int indx = sb.indexOf(Character.toString(ch));

            if (indx != -1) {
                sb.deleteCharAt(indx);

            } else {
                isAna = false;
                break;
            }
        }
        System.out.println("Anagram: " + isAna);
    }
}