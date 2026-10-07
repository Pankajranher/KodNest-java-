import java.util.Scanner;

class Account {
    private int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accountNumber) {
        // Add the required parent-constructor call
        super(accountNumber);
    }
}

public class Complate_the_parent_constructor_call {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read, create and print
        int An = scanner.nextInt();
        SavingsAccount acc = new SavingsAccount(An);
        System.out.println(acc.getAccountNumber());
        scanner.close();
    }
}