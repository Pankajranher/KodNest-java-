
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Create_book_details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        String bookTitle = scanner.nextLine();
        String bookauthor = scanner.nextLine();

        // Create one Book object
        Book bk = new Book(bookTitle, bookauthor);

        // Call display()
        bk.display();
    }
}