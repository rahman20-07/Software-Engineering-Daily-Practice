package oop.inheritance.hierarchical;

import java.util.Scanner;

public class BankAccountCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Type: Savings or Current");
        String type = sc.nextLine();

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:");
        double initialBalance = sc.nextDouble();

        if (initialBalance < 0) {

            System.out.println("Invalid Initial Balance!");

        } else if (type.equalsIgnoreCase("Savings")) {

            System.out.println("Enter Annual Rate and Number of Years:");

            double annualRate = sc.nextDouble();
            int years = sc.nextInt();

            if (annualRate < 0 || years < 0) {
                System.out.println("Invalid interest rate or years!");
            } else {

                SavingsAccount account = new SavingsAccount(
                    accountNumber, name, initialBalance,
                    annualRate, years
                );

                account.displayDetails();

                System.out.printf("Final Balance: %.2f%n",
                        account.calculateFinalBalance());
            }

        } else if (type.equalsIgnoreCase("Current")) {

            System.out.println("Enter Transaction Fee:");

            double transactionFee = sc.nextDouble();

            if (transactionFee < 0 || transactionFee > initialBalance) {
                System.out.println("Invalid Transaction Fee!");
            } else {

                CurrentAccount account = new CurrentAccount(
                    accountNumber, name, initialBalance, transactionFee
                );

                account.displayDetails();

                System.out.printf("Final Balance: %.2f%n",
                        account.calculateFinalBalance());
            }

        } else {

            System.out.println("Invalid Account Type!");
        }

        sc.close();
    }
}

class BankAccount {

    protected int accountNumber;
    protected String holderName;
    protected double initialBalance;

    public BankAccount(int accountNumber, String holderName,
                       double initialBalance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.initialBalance = initialBalance;
    }

    public double calculateFinalBalance() {

        return initialBalance;
    }

    public void displayDetails() {

        System.out.println("\n----- Bank Account Details -----");

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Initial Balance: " + initialBalance);
    }
}

class SavingsAccount extends BankAccount {

    private double annualRate;
    private int years;

    public SavingsAccount(int accountNumber, String holderName,
                          double initialBalance, double annualRate,
                          int years) {

        super(accountNumber, holderName, initialBalance);

        this.annualRate = annualRate;
        this.years = years;
    }

    @Override
    public double calculateFinalBalance() {

        return initialBalance +
               (initialBalance * annualRate * years) / 100;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Account Type: Savings");
        System.out.println("Annual Rate: " + annualRate);
        System.out.println("Years: " + years);
    }
}

class CurrentAccount extends BankAccount {

    private double transactionFee;

    public CurrentAccount(int accountNumber, String holderName,
                          double initialBalance, double transactionFee) {

        super(accountNumber, holderName, initialBalance);

        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateFinalBalance() {

        return initialBalance - transactionFee;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Account Type: Current");
        System.out.println("Transaction Fee: " + transactionFee);
    }
}
