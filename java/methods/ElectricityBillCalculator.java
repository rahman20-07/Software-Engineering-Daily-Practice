package methods;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void displayWelcome() {

        System.out.println("Welcome to Electricity Bill Calculator.");
    }

    public static double calculateBill(int units) {

        double bill = 0.0;

        if (units < 0) {

            return -1;

        } else if (units <= 100) {

            bill = units * 2.0;

        } else if (units <= 200) {

            bill = (100 * 2.0) + (units - 100) * 3.0;

        } else {

            bill = (100 * 2.0) + (100 * 3.0)
                    + (units - 200) * 5.0;
        }

        return bill;
    }

    public static void displayBill(double amount) {

        System.out.printf("Total bill: Rs. %.2f%n", amount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayWelcome();

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {

            System.out.println("Invalid units. Units cannot be negative.");

        } else {

            double bill = calculateBill(units);

            displayBill(bill);
        }

        sc.close();
    }
}
