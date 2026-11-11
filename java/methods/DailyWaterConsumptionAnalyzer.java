package methods;

import java.util.Scanner;

public class DailyWaterConsumptionAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter water consumption for 7 days (in litres):");

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double d4 = sc.nextDouble();
        double d5 = sc.nextDouble();
        double d6 = sc.nextDouble();
        double d7 = sc.nextDouble();

        if (d1 < 0 || d2 < 0 || d3 < 0 || d4 < 0 ||
            d5 < 0 || d6 < 0 || d7 < 0) {

            System.out.println("Consumption cannot be negative.");

        } else {

            displayAnalysis(d1, d2, d3, d4, d5, d6, d7);
        }

        sc.close();
    }

    public static double calculateTotal(
            double d1, double d2, double d3,
            double d4, double d5, double d6, double d7) {

        return d1 + d2 + d3 + d4 + d5 + d6 + d7;
    }

    public static double calculateAverage(double total) {

        return total / 7;
    }

    public static double findMaximum(
            double d1, double d2, double d3,
            double d4, double d5, double d6, double d7) {

        double max = d1;

        if (d2 > max) max = d2;
        if (d3 > max) max = d3;
        if (d4 > max) max = d4;
        if (d5 > max) max = d5;
        if (d6 > max) max = d6;
        if (d7 > max) max = d7;

        return max;
    }

    public static boolean isAverageAboveTarget(double average) {

        return average > 2;
    }

    public static void displayAnalysis(
            double d1, double d2, double d3,
            double d4, double d5, double d6, double d7) {

        double total = calculateTotal(d1, d2, d3, d4, d5, d6, d7);

        double average = calculateAverage(total);

        double maximum = findMaximum(d1, d2, d3, d4, d5, d6, d7);

        boolean aboveTarget = isAverageAboveTarget(average);

        System.out.println("\n===== WEEKLY WATER ANALYSIS =====");

        System.out.printf("Total consumption: %.2f litres%n", total);

        System.out.printf("Average consumption: %.2f litres%n", average);

        System.out.printf("Maximum daily consumption: %.2f litres%n", maximum);

        System.out.println("Average above 2 litres: " + aboveTarget);

        System.out.println("=================================");
    }
}
