package methods;

import java.util.Scanner;

public class ParkingFeeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter vehicle type (1-Two-wheeler, 2-Four-wheeler): ");
        int vehicleType = sc.nextInt();

        if (hours <= 0) {

            System.out.println("Invalid parking hours.");

        } else if (vehicleType != 1 && vehicleType != 2) {

            System.out.println("Invalid vehicle type.");

        } else {

            displayParkingBill(hours, vehicleType);
        }

        sc.close();
    }

    public static void displayParkingName() {

        System.out.println("Parking Facility: ABC Parking Services");
    }

    public static double calculateBaseFee(int hours) {

        double baseFee;

        if (hours <= 2) {

            baseFee = 30 * hours;

        } else {

            baseFee = 60 + (hours - 2) * 20;
        }

        return baseFee;
    }

    public static double calculateVehicleCharge(int vehicleType) {

        double additionalCharge = 0.0;

        if (vehicleType == 2) {

            additionalCharge = 50.0;
        }

        return additionalCharge;
    }

    public static double calculateTotalFee(int hours, int vehicleType) {

        double baseFee = calculateBaseFee(hours);

        double vehicleCharge = calculateVehicleCharge(vehicleType);

        return baseFee + vehicleCharge;
    }

    public static void displayParkingBill(int hours, int vehicleType) {

        displayParkingName();

        double baseFee = calculateBaseFee(hours);

        double vehicleCharge = calculateVehicleCharge(vehicleType);

        double totalFee = baseFee + vehicleCharge;

        System.out.println("\n===== PARKING BILL =====");

        System.out.println("Parking Hours: " + hours);

        System.out.println("Vehicle Type: " +
                (vehicleType == 1 ? "Two-wheeler" : "Four-wheeler"));

        System.out.printf("Base Fee: Rs. %.2f%n", baseFee);

        System.out.printf("Vehicle Charge: Rs. %.2f%n", vehicleCharge);

        System.out.printf("Total Parking Fee: Rs. %.2f%n", totalFee);

        System.out.println("========================");
    }
}
