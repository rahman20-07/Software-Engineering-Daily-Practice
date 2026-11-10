package oop.constructors.chaining;

import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int id = sc.nextInt();
        int units = sc.nextInt();
        double costPerUnit = sc.nextDouble();

        ElectricityBill e;

        if (costPerUnit == 0) {
            e = new ElectricityBill(name, id, units);
        } else {
            e = new ElectricityBill(name, id, units, costPerUnit);
        }

        System.out.println("Customer Name: " + name);
        System.out.println("Meter Number: " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: " + e.calculateBill());

        sc.close();
    }
}

class ElectricityBill {

    private String customerName;
    private int meterNumber;
    private int unitsConsumed;
    private double costPerUnit;

    ElectricityBill(String customerName, int meterNumber,
                    int unitsConsumed) {

        this.customerName = customerName;
        this.meterNumber = meterNumber;
        this.unitsConsumed = unitsConsumed;
        this.costPerUnit = 6.0;
    }

    ElectricityBill(String customerName, int meterNumber,
                    int unitsConsumed, double costPerUnit) {

        this(customerName, meterNumber, unitsConsumed);
        this.costPerUnit = costPerUnit;
    }

    public double calculateBill() {
        return unitsConsumed * costPerUnit;
    }
}
