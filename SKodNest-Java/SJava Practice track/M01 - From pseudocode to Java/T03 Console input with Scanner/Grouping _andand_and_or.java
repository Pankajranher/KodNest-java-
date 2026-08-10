import java.util.Scanner;

class Grouping_andand_and_or {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        if ((codingScore >= 60 && attendance >= 75) || projects >= 2) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        scanner.close();

    }
}
