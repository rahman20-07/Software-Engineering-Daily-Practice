package classicquestions;

import java.util.Scanner;

public class RecursionDecimalToBinary {

    public static void decimalToBinary(int number) {

        if (number == 0) {
            return;
        }

        decimalToBinary(number / 2);

        System.out.print(number % 2);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a decimal number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                return;
            }

            System.out.print("Binary of " + number + " is = ");

            if (number == 0) {
                System.out.print(0);
            } else {
                decimalToBinary(number);
            }

            System.out.println();
        }
    }
}
