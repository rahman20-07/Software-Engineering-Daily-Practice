package classicquestions;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the start number of range: ");
            int start = scanner.nextInt();

            System.out.print("Enter the end number of range: ");
            int end = scanner.nextInt();

            if (start < 0 || end < 0 || start > end) {
                System.out.println("Please enter a valid non-negative range.");
                return;
            }

            System.out.println("Automorphic numbers:");

            for (long number = start; number <= end; number++) {

                long temp = number;
                long square = number * number;

                boolean isAutomorphic = true;

                while (temp > 0) {

                    long digit = temp % 10;
                    long squareDigit = square % 10;

                    if (digit != squareDigit) {
                        isAutomorphic = false;
                        break;
                    }

                    temp /= 10;
                    square /= 10;
                }

                if (isAutomorphic) {
                    System.out.println(number);
                }
            }
        }
    }
}
