import java.util.Scanner;

class Book {
    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book B = (Book) obj;
        return bookId == B.bookId;
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}

public class Implement_book_equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        // Create and compare two books
        Book b1 = new Book(firstId);
        Book b2 = new Book(secondId);

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
        scanner.close();
    }
}