import java.util.Arrays;
import java.util.Scanner;

public class Check_anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.next();
        System.out.println("Enter the second string");
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
            return;
        }
        char char1[] = s1.toCharArray();
        char char2[] = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String sortedstr1 = new String(char1);
        String sortedstr2 = new String(char2);

        if (sortedstr1.equals(sortedstr2)) {
            System.out.println("Given String is an ANAGRAM");
        } else {
            System.out.println("Given String is NOT an ANAGRAM");
        }
    }
}
