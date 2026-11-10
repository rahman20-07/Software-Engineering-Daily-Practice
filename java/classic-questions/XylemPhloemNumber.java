package classicquestions;

import java.util.Scanner;

public class XylemPhloemNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the number: ");
            int number = scanner.nextInt();

            if (number < 10) {
                System.out.println("Please enter a number with at least two digits.");
                return;
            }

            if (number < 0) {
                System.out.println("Negative numbers are not allowed.");
                return;
            }

            long temp = number;

            long extremeSum = temp % 10;
            temp /= 10;

            long meanSum = 0;

            while (temp > 9) {

                long digit = temp % 10;

                meanSum += digit;

                temp /= 10;
            }

            extremeSum += temp;

            if (extremeSum == meanSum) {
                System.out.println(number + " is a Xylem Number.");
            } else {
                System.out.println(number + " is a Phloem Number.");
            }
        }
    }
}
