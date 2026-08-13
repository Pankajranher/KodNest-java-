class Robot {
    void speak() {
        System.out.println("Beep beep! Java is my superpower!");
    }
}

public class Create_and_call_first_method {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.speak();

    }
}
