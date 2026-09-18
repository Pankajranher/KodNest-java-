import java.util.Scanner;

class Message {
    String text;
    static String course = "Java";

    Message(String text) {
        // Store the message.
        this.text = text;
    }

    void displayText() {
        // Display the instance text.
        System.out.println("Message: " + text);
    }

    static void displayCourse() {
        // Display the shared course.
        System.out.println("Course: " + course);
    }

}

public class Call_instunce_and_static_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create one object and call both methods correctly.
        String msg = scanner.nextLine();
        Message m1 = new Message(msg);
        m1.displayText();
        Message.displayCourse();
    }
}