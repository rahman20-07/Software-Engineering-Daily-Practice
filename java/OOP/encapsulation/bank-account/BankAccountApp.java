package oop.encapsulation.bankaccount;

import java.util.Scanner;

public class BankAccountApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number, Name and Initial Balance:");

        int accNum = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, name, balance);

        System.out.println("Enter Deposit Amount:");
        double depositAmount = sc.nextDouble();

        System.out.println("Enter Withdraw Amount:");
        double withdrawAmount = sc.nextDouble();

        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        System.out.println("\n----- Account Details -----");

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Available Balance: " + account.getBalance());

        sc.close();
    }
}

class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);

        if (balance < 0) {
            System.out.println("Invalid initial balance. Setting balance to 0.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("Amount " + amount + " deposited successfully!");

            return true;

        } else {

            System.out.println("Invalid deposit amount!");

            return false;
        }
    }

    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println("Amount " + amount + " withdrawn successfully!");

            return true;

        } else {

            System.out.println("Invalid withdrawal amount or insufficient balance!");

            return false;
        }
    }
}
