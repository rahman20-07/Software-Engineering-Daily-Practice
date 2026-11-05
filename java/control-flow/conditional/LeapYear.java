package controlflow.conditional;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            if (year <= 0) {
                System.out.println("Please enter a valid positive year.");
                return;
            }

            if ((year % 4 == 0 && year % 100 != 0)
                    || year % 400 == 0) {

                System.out.println(year + " is a leap year.");

            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
