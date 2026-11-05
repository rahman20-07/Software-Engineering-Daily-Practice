package controlflow.conditional;

import java.util.Scanner;

public class ElectricBillCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter electricity units: ");
            int units = scanner.nextInt();

            if (units < 0) {
                System.out.println("Units cannot be negative.");
                return;
            }

            double bill;

            if (units <= 100) {
                bill = units * 5;
            } else if (units <= 200) {
                bill = (100 * 5) + (units - 100) * 7;
            } else {
                bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
            }

            System.out.printf("Total electricity bill: Rs. %.2f%n", bill);
        }
    }
}
