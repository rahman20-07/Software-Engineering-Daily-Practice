package loops.numberproblems;

import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the starting number: ");
            int start = scanner.nextInt();

            System.out.print("Enter the ending number: ");
            int end = scanner.nextInt();

            if (start > end) {
                System.out.println("Starting number cannot exceed ending number.");
                return;
            }

            boolean primeFound = false;

            for (int number = start; number <= end; number++) {

                if (number < 2) {
                    continue;
                }

                boolean isPrime = true;

                for (int divisor = 2; divisor <= number / divisor; divisor++) {

                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(number);
                    primeFound = true;
                }
            }

            if (!primeFound) {
                System.out.println("No prime numbers found in this range.");
            }
        }
    }
}
