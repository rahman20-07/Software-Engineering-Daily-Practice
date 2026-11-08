package classicquestions;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a decimal number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                return;
            }

            if (number == 0) {
                System.out.println("Binary representation: 0");
                return;
            }

            int quotient = number;

            StringBuilder binary = new StringBuilder();

            while (quotient > 0) {

                int remainder = quotient % 2;

                binary.append(remainder);

                quotient /= 2;
            }

            binary.reverse();

            System.out.println("Binary representation: " + binary);
        }
    }
}
