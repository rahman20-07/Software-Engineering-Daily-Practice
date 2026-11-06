import java.util.Scanner;

public class BankAccountManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number, Name and Initial Balance:");

        int accNum = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();
        double balance = sc.nextDouble();

        if (accNum <= 0 || name.isBlank() ||
            !Double.isFinite(balance) || balance < 0) {

            System.out.println("Error: Invalid account details.");
            sc.close();
            return;
        }

        BankAccount account = new BankAccount(accNum, name, balance);

        System.out.println("Enter Deposit Amount:");
        double depositAmount = sc.nextDouble();

        System.out.println("Enter Withdrawal Amount:");
        double withdrawalAmount = sc.nextDouble();

        // Deposit operation
        if (account.deposit(depositAmount)) {
            System.out.println("Deposit successful: " + depositAmount);
        } else {
            System.out.println("Deposit failed: Invalid amount.");
        }

        // Withdrawal operation
        if (account.withdraw(withdrawalAmount)) {
            System.out.println("Withdrawal successful: " + withdrawalAmount);
        } else {
            System.out.println("Withdrawal failed: Invalid amount or insufficient balance.");
        }

        System.out.printf(
                "Available Balance: %.2f%n",
                account.getBalance()
        );

        sc.close();
    }
}

class BankAccount {

    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method

    public boolean deposit(double amount) {

        if (!Double.isFinite(amount) || amount <= 0 ||
            !Double.isFinite(balance + amount)) {
            return false;
        }

        balance += amount;

        return true;
    }

    // Withdrawal Method

    public boolean withdraw(double amount) {

        if (!Double.isFinite(amount) || amount <= 0 ||
            amount > balance) {
            return false;
        }

        balance -= amount;

        return true;
    }
}
