package oop.inheritance.constructorchaining;

import java.util.Scanner;

public class VehicleRentalDiscountCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for Discount or 0 for No Discount:");

        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("Enter Vehicle Number, Name, Rent Per Day, Rental Days and Discount Percentage:");

            int number = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            double rentPerDay = sc.nextDouble();
            int numberOfDays = sc.nextInt();
            double discountPercentage = sc.nextDouble();

            RentalVehicle vehicle = new RentalVehicle(
                number, name, rentPerDay,
                numberOfDays, discountPercentage
            );

            vehicle.displayDetails();

        } else if (choice == 0) {

            System.out.println("Enter Vehicle Number, Name, Rent Per Day and Rental Days:");

            int number = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();

            double rentPerDay = sc.nextDouble();
            int numberOfDays = sc.nextInt();

            RentalVehicle vehicle = new RentalVehicle(
                number, name, rentPerDay, numberOfDays
            );

            vehicle.displayDetails();

        } else {

            System.out.println("Invalid Input!");
        }

        sc.close();
    }
}

class Vehicle {

    protected int number;
    protected String name;
    protected double rentPerDay;

    public Vehicle(int number, String name, double rentPerDay) {

        this.number = number;
        this.name = name;
        this.rentPerDay = rentPerDay;
    }

    public void displayDetails() {

        System.out.println("Vehicle Number: " + number);
        System.out.println("Vehicle Name: " + name);
        System.out.println("Rent Per Day: " + rentPerDay);
    }
}

class RentalVehicle extends Vehicle {

    private int numberOfDays;
    private double discountPercentage;

    public RentalVehicle(int number, String name,
                         double rentPerDay, int numberOfDays) {

        super(number, name, rentPerDay);

        this.numberOfDays = numberOfDays;
        this.discountPercentage = 0.0;
    }

    public RentalVehicle(int number, String name,
                         double rentPerDay, int numberOfDays,
                         double discountPercentage) {

        this(number, name, rentPerDay, numberOfDays);

        this.discountPercentage = discountPercentage;
    }

    public double calculateTotalRent() {

        return rentPerDay * numberOfDays;
    }

    public double calculateDiscount() {

        return calculateTotalRent() * discountPercentage / 100;
    }

    public double calculateFinalBill() {

        return calculateTotalRent() - calculateDiscount();
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Rental Days: " + numberOfDays);
        System.out.println("Discount Percentage: " + discountPercentage);

        System.out.printf("Total Rent: %.2f%n", calculateTotalRent());
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Bill: %.2f%n", calculateFinalBill());
    }
}
