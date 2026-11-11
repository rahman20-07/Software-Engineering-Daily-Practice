package methods;

public class BankAccountManagement {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        // Account 1
        b1.accountNumber = 987654432L;
        b1.accountHolderName = "Ibrahim";
        b1.balance = 5000.0;

        // Account 2
        b2.accountNumber = 1234567890L;
        b2.accountHolderName = "Rahman";
        b2.balance = 7000.0;

        // Accessing static members using class name
        BankAccount.displayBankDetails();

        System.out.println("\nAccount Details:");

        b1.displayAccountDetails();

        System.out.println();

        b2.displayAccountDetails();

        // Performing transactions on account 1
        System.out.println("\nPerforming Transactions:");

        b1.withdraw(500.0);
        b1.displayAccountDetails();

        System.out.println();

        b1.deposit(1200.0);
        b1.displayAccountDetails();
    }
}

class BankAccount {

    // Static variables: shared by all objects
    static String bankName = "SBI";
    static String branchName = "Patna";

    // Instance variables: separate for each object
    long accountNumber;
    String accountHolderName;
    double balance;

    public static void displayBankDetails() {

        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("Deposit successful: " + amount);

        } else {

            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid withdrawal amount.");

        } else if (amount > balance) {

            System.out.println("Insufficient balance.");

        } else {

            balance -= amount;

            System.out.println("Withdrawal successful: " + amount);
        }
    }
}
