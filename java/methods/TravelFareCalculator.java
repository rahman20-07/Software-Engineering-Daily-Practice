package methods;

import java.util.Scanner;

public class TravelFareCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayTravelAgencyName();

        System.out.print("Enter travel distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        if (distance <= 0 || age < 0) {
            System.out.println("Invalid distance or age.");
            sc.close();
            return;
        }

        displayTicket(distance, age);

        sc.close();
    }

    public static void displayTravelAgencyName() {

        System.out.println("===== VLR TRAVELS =====");
    }

    public static double calculateBaseFare(int distance) {

        if (distance <= 100) {
            return 300;
        } else if (distance <= 300) {
            return 600;
        } else {
            return 1000;
        }
    }

    public static double calculateDiscount(double baseFare, int age) {

        if (age < 5) {
            return 0.50 * baseFare;
        } else if (age >= 60) {
            return 0.30 * baseFare;
        }

        return 0;
    }

    public static double calculateFinalFare(int distance, int age) {

        double baseFare = calculateBaseFare(distance);
        double discount = calculateDiscount(baseFare, age);

        return baseFare - discount;
    }

    public static void displayTicket(int distance, int age) {

        double baseFare = calculateBaseFare(distance);
        double discount = calculateDiscount(baseFare, age);
        double finalFare = calculateFinalFare(distance, age);

        System.out.println("\n----- TRAVEL TICKET -----");

        System.out.println("Travel Distance: " + distance + " km");
        System.out.println("Passenger Age: " + age);

        System.out.printf("Base Fare: Rs. %.2f%n", baseFare);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Final Fare: Rs. %.2f%n", finalFare);
    }
}
