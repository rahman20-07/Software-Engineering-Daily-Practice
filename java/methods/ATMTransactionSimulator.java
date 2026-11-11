package methods;

import java.util.Scanner;

public class ATMTransactionSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000.0;

        showMenu();

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();

            balance = deposit(balance, amount);

        } else if (choice == 2) {

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            balance = withdraw(balance, amount);

        } else {

            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        displayBalance(balance);

        sc.close();
    }

    public static void showMenu() {

        System.out.println("Welcome to Bank of Java!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
    }

    public static double deposit(double balance, double amount) {

        if (amount <= 0) {

            System.out.println("Invalid deposit amount.");

        } else {

            balance += amount;

            System.out.println("Amount deposited successfully: " + amount);
        }

        return balance;
    }

    public static double withdraw(double balance, double amount) {

        if (amount <= 0 || amount > balance) {

            System.out.println("Invalid withdrawal amount.");

        } else {

            balance -= amount;

            System.out.println("Amount withdrawn successfully: " + amount);
        }

        return balance;
    }

    public static void displayBalance(double balance) {

        System.out.println("Current balance: " + balance);
    }
}
