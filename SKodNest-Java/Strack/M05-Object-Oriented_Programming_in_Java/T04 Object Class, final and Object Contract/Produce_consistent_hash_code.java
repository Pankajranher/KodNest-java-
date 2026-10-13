import java.util.Scanner;

class Book {
    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    // Override equals() and hashCode()
    @Override
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

    @Override
    public int hashCode() {
        return this.bookId;
    }
}

public class Produce_consistent_hash_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create two equal books and verify the contract
        Book b1 = new Book(id);
        Book b2 = new Book(id);

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode() == b2.hashCode());
        scanner.close();
    }
}