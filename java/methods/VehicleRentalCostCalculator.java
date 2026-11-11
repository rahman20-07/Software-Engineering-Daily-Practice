package methods;

import java.util.Scanner;

public class VehicleRentalCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== VEHICLE RENTAL BOOKING =====");

        System.out.print("Booking ID: ");
        int bookingId = sc.nextInt();
        sc.nextLine();

        System.out.print("Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Vehicle Type (Bike/Car/SUV): ");
        String vehicleType = sc.nextLine().trim();

        System.out.print("Rental Days: ");
        int rentalDays = sc.nextInt();

        System.out.print("Insurance Charge: ");
        double insuranceCharge = sc.nextDouble();

        if (bookingId <= 0 || customerName.isBlank()
                || rentalDays <= 0 || insuranceCharge < 0) {

            System.out.println("Invalid booking details.");
            sc.close();
            return;
        }

        VehicleRental rental = new VehicleRental(
                bookingId,
                customerName,
                vehicleType,
                rentalDays,
                insuranceCharge
        );

        if (!rental.isValidVehicle()) {
            System.out.println("Invalid vehicle type. Choose Bike, Car, or SUV.");
        } else {
            rental.displayDetails();
        }

        sc.close();
    }
}

class VehicleRental {

    private int bookingId;
    private String customerName;
    private String vehicleType;

    private int rentalDays;
    private double dailyRent;
    private double insuranceCharge;
    private double totalRent;

    // Constructor 1: Default constructor
    VehicleRental() {

        this.bookingId = 0;
        this.customerName = "Unknown";
        this.vehicleType = "Unknown";
        this.rentalDays = 0;
        this.dailyRent = 0;
        this.insuranceCharge = 0;
        this.totalRent = 0;
    }

    // Constructor 2
    VehicleRental(int bookingId, String customerName, String vehicleType) {

        this();

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.vehicleType = vehicleType;

        this.dailyRent = calculateDailyRent();
    }

    // Constructor 3
    VehicleRental(
            int bookingId,
            String customerName,
            String vehicleType,
            int rentalDays) {

        this(bookingId, customerName, vehicleType);

        this.rentalDays = rentalDays;
    }

    // Constructor 4
    VehicleRental(
            int bookingId,
            String customerName,
            String vehicleType,
            int rentalDays,
            double insuranceCharge) {

        this(bookingId, customerName, vehicleType, rentalDays);

        this.insuranceCharge = insuranceCharge;
    }

    public double calculateDailyRent() {

        if (vehicleType.equalsIgnoreCase("Bike")) {
            return 500;
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            return 1500;
        } else if (vehicleType.equalsIgnoreCase("SUV")) {
            return 2500;
        }

        return 0;
    }

    public boolean isValidVehicle() {

        return dailyRent > 0;
    }

    public double calculateTotalRentalCost() {

        totalRent = (dailyRent * rentalDays) + insuranceCharge;

        return totalRent;
    }

    public void displayDetails() {

        calculateTotalRentalCost();

        System.out.println("\n----- RENTAL DETAILS -----");

        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rental Days: " + rentalDays);

        System.out.printf("Daily Rent: Rs. %.2f%n", dailyRent);
        System.out.printf("Insurance Charge: Rs. %.2f%n", insuranceCharge);
        System.out.printf("Total Rental Cost: Rs. %.2f%n", totalRent);
    }
}
