import java.util.Scanner;

abstract class Document {
    String title;

    Document(String title) {
        // Store title
        this.title = title;
    }

    abstract void showType();
}

interface Printable {
    void print();
}

class Report extends Document implements Printable {
    // Complete constructor and both methods
    Report(String title) {
        super(title);
    }

    @Override
    public void showType() {
        System.out.println("Report: " + title);
    }

    @Override
    public void print() {
        System.out.println("Printed: " + title);
    }
}

public class Combine_an_abstract_class_and_inteerface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();
        // Create Report and call both methods

        Report r = new Report(title);
        r.showType();
        r.print();
    }
}