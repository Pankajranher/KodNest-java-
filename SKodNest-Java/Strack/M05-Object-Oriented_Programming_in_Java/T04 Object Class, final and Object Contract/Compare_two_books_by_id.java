import java.util.Scanner;

class Book {
    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals()
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            Book other = (Book) obj;

            return this.bookId == other.bookId;

        }

        return false;
    }
}

public class Compare_two_books_by_id {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        // Compare two Book objects
        Book b1 = new Book(firstId);
        Book b2 = new Book(secondId);

        if (b1.equals(b2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        scanner.close();
    }
}