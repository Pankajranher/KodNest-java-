import java.util.Scanner;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

class Notebook implements Readable, Writable {
    // Add name, constructor and both methods
    String name;

    Notebook(String name) {
        this.name = name;
    }

    public void read() {
        System.out.println(name + " opened");
    }

    public void write() {
        System.out.println(name + " saved");
    }

}

public class Implement_two_notebook_capabilities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // Create Notebook and call both methods

        Notebook nt = new Notebook(name);
        nt.read();
        nt.write();

    }
}