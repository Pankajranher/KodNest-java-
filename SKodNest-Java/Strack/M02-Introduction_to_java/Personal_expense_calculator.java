import java.util.Scanner;

public class Personal_expense_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float monthlyIncome = scanner.nextFloat();
        float rentExpense = scanner.nextFloat();
        float foodExpense = scanner.nextFloat();
        float travelExpense = scanner.nextFloat();

        float totalExpense = rentExpense + foodExpense + travelExpense;
        float remainingAmount = monthlyIncome - totalExpense;

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount == 0 || remainingAmount > 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }
        scanner.close();
    }
}