package methods;

import java.util.Scanner;

public class ElectricityBillAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer ID: ");
        int customerId = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter units consumed: ");
        int unitsConsumed = sc.nextInt();

        if (customerId <= 0 || customerName.isBlank() || unitsConsumed < 0) {

            System.out.println("Invalid customer details or units consumed.");

        } else {

            ElectricityAccount account =
                    new ElectricityAccount(customerId, customerName, unitsConsumed);

            account.calculateBill();

            account.displayDetails();
        }

        sc.close();
    }
}

class ElectricityAccount {

    private int customerId;
    private String customerName;
    private int unitsConsumed;
    private double finalBill;

    // Default constructor
    ElectricityAccount() {

        customerId = 0;
        customerName = "Unknown";
        unitsConsumed = 0;
        finalBill = 0.0;
    }

    // Parameterized constructor
    ElectricityAccount(int customerId, String customerName) {

        this();

        this.customerId = customerId;
        this.customerName = customerName;
    }

    // Constructor chaining
    ElectricityAccount(int customerId, String customerName, int unitsConsumed) {

        this(customerId, customerName);

        this.unitsConsumed = unitsConsumed;
    }

    public void calculateBill() {

        if (unitsConsumed <= 100) {

            finalBill = unitsConsumed * 3.0;

        } else {

            finalBill = (100 * 3.0) + (unitsConsumed - 100) * 5.0;
        }
    }

    public void displayDetails() {

        System.out.println("\n===== ELECTRICITY BILL =====");

        System.out.println("Customer ID: " + customerId);

        System.out.println("Customer Name: " + customerName);

        System.out.println("Units Consumed: " + unitsConsumed);

        System.out.printf("Final Bill Amount: Rs. %.2f%n", finalBill);

        System.out.println("============================");
    }
}
