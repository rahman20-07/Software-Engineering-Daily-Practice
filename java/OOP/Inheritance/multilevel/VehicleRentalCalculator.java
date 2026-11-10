package oop.inheritance.multilevel;

import java.util.Scanner;

public class VehicleRentalCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Number, Brand, Daily Rent, Rental Days and Service Charge:");

        String number = sc.nextLine();
        String brand = sc.nextLine();

        double dailyRent = sc.nextDouble();
        int days = sc.nextInt();
        double serviceCharge = sc.nextDouble();

        RentalCar car = new RentalCar(
            number, brand, dailyRent, serviceCharge
        );

        car.displayDetails();

        System.out.printf("Rental Amount: %.2f%n",
                car.calculateRent(days));

        System.out.printf("Final Bill: %.2f%n",
                car.calculateFinalBill(days));

        sc.close();
    }
}

class Vehicle {

    protected String number;
    protected String brand;

    public Vehicle(String number, String brand) {

        this.number = number;
        this.brand = brand;
    }

    public void displayDetails() {

        System.out.println("Vehicle Number: " + number);
        System.out.println("Brand: " + brand);
    }
}

class RentalVehicle extends Vehicle {

    protected double dailyRent;

    public RentalVehicle(String number, String brand, double dailyRent) {

        super(number, brand);
        this.dailyRent = dailyRent;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Daily Rent: " + dailyRent);
    }

    public double calculateRent(int numberOfDays) {

        return dailyRent * numberOfDays;
    }
}

class RentalCar extends RentalVehicle {

    private double serviceCharge;

    public RentalCar(String number, String brand,
                     double dailyRent, double serviceCharge) {

        super(number, brand, dailyRent);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Service Charge: " + serviceCharge);
    }

    public double calculateFinalBill(int numberOfDays) {

        return calculateRent(numberOfDays) + serviceCharge;
    }
}
