import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        // Store opening balance
        this.balance = balance;
    }

    public void withdraw(double amount) {
        // Perform a valid withdrawal
        if (amount > 0) {
            if (balance < amount) {
                balance = balance;
            } else {
                balance = balance - amount;
            }

        }
    }

    public double getBalance() {
        // Return balance
        return balance;
    }
}

public class Withdraw_from_a_simple_account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Complete the program
        double opbal = scanner.nextDouble();
        double witbal = scanner.nextDouble();

        BankAccount BA = new BankAccount(opbal);
        BA.withdraw(witbal);
        System.out.println(BA.getBalance());
    }
}