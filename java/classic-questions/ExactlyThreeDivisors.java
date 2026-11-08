package classicquestions;

import java.util.Scanner;

public class ExactlyThreeDivisors {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the start number of range: ");
            int start = scanner.nextInt();

            System.out.print("Enter the end number of range: ");
            int end = scanner.nextInt();

            if (start < 1 || end < 1 || start > end) {
                System.out.println("Please enter a valid positive range.");
                return;
            }

            System.out.println("Numbers having exactly 3 divisors:");

            for (int number = start; number <= end; number++) {

                int divisorCount = 0;

                for (int divisor = 1; divisor <= number; divisor++) {

                    if (number % divisor == 0) {
                        divisorCount++;
                    }
                }

                if (divisorCount == 3) {
                    System.out.println(number);
                }
            }
        }
    }
}
