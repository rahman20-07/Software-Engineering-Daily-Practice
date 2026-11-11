package methods;

import java.util.Scanner;

public class CourierDeliveryChargeAndBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parcel weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter delivery type (1-Standard, 2-Express): ");
        int deliveryType = sc.nextInt();

        if (weight <= 0) {

            System.out.println("Invalid parcel weight.");

        } else if (deliveryType != 1 && deliveryType != 2) {

            System.out.println("Invalid delivery type.");

        } else {

            printCourierBill(weight, deliveryType);
        }

        sc.close();
    }

    public static void displayCourierName() {

        System.out.println("Courier Company: ABC Couriers");
    }

    public static double calculateWeightCharge(double weight) {

        double charge;

        if (weight <= 1) {

            charge = 50.0;

        } else if (weight <= 5) {

            charge = 50 + (weight - 1) * 30;

        } else {

            charge = 50 + (4 * 30) + (weight - 5) * 20;
        }

        return charge;
    }

    public static double calculateSpeedCharge(double weight, int deliveryType) {

        double additionalCharge = 0;

        if (deliveryType == 2) {

            additionalCharge = calculateWeightCharge(weight) * 0.25;
        }

        return additionalCharge;
    }

    public static double calculateTotalCharge(double weight, int deliveryType) {

        double weightCharge = calculateWeightCharge(weight);

        double speedCharge = calculateSpeedCharge(weight, deliveryType);

        return weightCharge + speedCharge;
    }

    public static void printCourierBill(double weight, int deliveryType) {

        displayCourierName();

        double weightCharge = calculateWeightCharge(weight);

        double speedCharge = calculateSpeedCharge(weight, deliveryType);

        double totalCharge = weightCharge + speedCharge;

        System.out.println("\n---------- COURIER BILL ----------");

        System.out.println("Parcel Weight: " + weight + " kg");

        System.out.println("Delivery Type: " +
                (deliveryType == 1 ? "Standard" : "Express"));

        System.out.println("Weight Charge: Rs. " + weightCharge);

        System.out.println("Speed Charge: Rs. " + speedCharge);

        System.out.println("Total Charge: Rs. " + totalCharge);

        System.out.println("----------------------------------");
    }
}
