package oop.abstraction;

import java.util.Scanner;

public class ElectricityBillCalculationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILL SYSTEM =====");
        System.out.println("1. Domestic Consumer");
        System.out.println("2. Commercial Consumer");

        System.out.print("Select Consumer Type: ");
        int type = sc.nextInt();

        if (type != 1 && type != 2) {
            System.out.println("Invalid Consumer Type!");
            sc.close();
            return;
        }

        System.out.print("Enter Consumer ID: ");
        int consumerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int unitsConsumed = sc.nextInt();

        if (consumerId <= 0 || consumerName.isBlank()
                || unitsConsumed < 0) {

            System.out.println("Invalid consumer details!");
            sc.close();
            return;
        }

        ElectricityConsumer consumer;

        switch (type) {

            case 1:
                consumer = new Domestic(
                        consumerId, consumerName, unitsConsumed
                );
                break;

            case 2:
                consumer = new CommercialConsumer(
                        consumerId, consumerName, unitsConsumed
                );
                break;

            default:
                System.out.println("Invalid Consumer Type!");
                sc.close();
                return;
        }

        // Runtime polymorphism
        consumer.displayBill();

        sc.close();
    }
}

abstract class ElectricityConsumer {

    private int consumerId;
    private String consumerName;
    private int unitsConsumed;

    ElectricityConsumer(
            int consumerId,
            String consumerName,
            int unitsConsumed) {

        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void displayBill() {

        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
    }
}

class Domestic extends ElectricityConsumer {

    public Domestic(
            int consumerId,
            String consumerName,
            int unitsConsumed) {

        super(consumerId, consumerName, unitsConsumed);
    }

    @Override
    public double calculateBill() {

        int units = getUnitsConsumed();

        if (units <= 100) {
            return units * 2.0;

        } else if (units <= 200) {
            return (100 * 2.0) + (units - 100) * 3.0;

        } else {
            return (100 * 2.0)
                    + (100 * 3.0)
                    + (units - 200) * 5.0;
        }
    }

    @Override
    public void displayBill() {

        System.out.println("\n===== DOMESTIC ELECTRICITY BILL =====");

        super.displayBill();

        System.out.printf("Total Bill: Rs. %.2f%n", calculateBill());
    }
}

class CommercialConsumer extends ElectricityConsumer {

    public CommercialConsumer(
            int consumerId,
            String consumerName,
            int unitsConsumed) {

        super(consumerId, consumerName, unitsConsumed);
    }

    @Override
    public double calculateBill() {

        return getUnitsConsumed() * 8.0;
    }

    @Override
    public void displayBill() {

        System.out.println("\n===== COMMERCIAL ELECTRICITY BILL =====");

        super.displayBill();

        System.out.printf("Total Bill: Rs. %.2f%n", calculateBill());
    }
}
