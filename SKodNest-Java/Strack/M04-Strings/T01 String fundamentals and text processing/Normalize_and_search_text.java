import java.util.Scanner;

public class Normalize_and_search_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        sentence = sentence.trim().toLowerCase();
        keyword = keyword.trim().toLowerCase();

        boolean found = sentence.contains(keyword);
        System.out.println(found);

        scanner.close();
    }
}
