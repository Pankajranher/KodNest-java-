import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Add only a positive amount
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class Deposit_into_a_bank_account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read both values
        double openBalance = scanner.nextDouble();
        double depositBalance = scanner.nextDouble();

        // Create account and deposit
        BankAccount Ac = new BankAccount(openBalance);
        Ac.deposit(depositBalance);

        // Print final balance
        System.out.println(Ac.getBalance());
    }

}
