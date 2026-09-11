import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();

        char charArr[] = str.toCharArray();

        char revArr[] = new char[str.length()];
        int j = revArr.length - 1;

        for (int i = 0; i < charArr.length; i++) {
            revArr[j] = charArr[i];
            j--;
        }

        String revStr = new String(revArr);

        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }

    }

}
