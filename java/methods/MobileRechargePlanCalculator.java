package methods;

import java.util.Scanner;

public class MobileRechargePlanCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Recharge Plans:");
        System.out.println("1. Rs. 199");
        System.out.println("2. Rs. 299");
        System.out.println("3. Rs. 599");
        System.out.println("4. Rs. 999");

        System.out.print("Enter plan code: ");
        int planCode = sc.nextInt();

        if (planCode < 1 || planCode > 4) {

            System.out.println("Invalid plan code. Please select 1 to 4.");

        } else {

            displayRechargeDetails(planCode);
        }

        sc.close();
    }

    public static void displayOperatorName() {

        System.out.println("Mobile Operator: ABC Telecom");
    }

    public static double getPlanAmount(int planCode) {

        double amount = 0;

        if (planCode == 1) {
            amount = 199.0;

        } else if (planCode == 2) {
            amount = 299.0;

        } else if (planCode == 3) {
            amount = 599.0;

        } else if (planCode == 4) {
            amount = 999.0;
        }

        return amount;
    }

    public static double calculateDiscount(double amount) {

        double discount = 0;

        if (amount >= 300 && amount < 600) {

            discount = amount * 5.0 / 100.0;

        } else if (amount >= 600) {

            discount = amount * 10.0 / 100.0;
        }

        return discount;
    }

    public static double calculateFinalAmount(int planCode) {

        double amount = getPlanAmount(planCode);

        double discount = calculateDiscount(amount);

        return amount - discount;
    }

    public static void displayRechargeDetails(int planCode) {

        displayOperatorName();

        double planAmount = getPlanAmount(planCode);

        double discount = calculateDiscount(planAmount);

        double finalAmount = planAmount - discount;

        System.out.println("\n===== RECHARGE BILL =====");

        System.out.printf("Plan Amount: Rs. %.2f%n", planAmount);

        System.out.printf("Discount: Rs. %.2f%n", discount);

        System.out.printf("Final Recharge Amount: Rs. %.2f%n", finalAmount);

        System.out.println("=========================");
    }
}
