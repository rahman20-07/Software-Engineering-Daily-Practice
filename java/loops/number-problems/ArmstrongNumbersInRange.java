package loops.numberproblems;

import java.util.Scanner;

public class ArmstrongNumbersInRange {

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

            boolean armstrongFound = false;

            for (long number = start; number <= end; number++) {

                if (number < 0) {
                    continue;
                }

                long temp = number;
                int digitCount = 0;
                long sum = 0;

                // Count the number of digits
                while (temp > 0) {
                    digitCount++;
                    temp /= 10;
                }

                if (number == 0) {
                    digitCount = 1;
                }

                temp = number;

                // Calculate the sum of digits raised to digitCount
                while (temp > 0) {

                    int digit = (int) (temp % 10);
                    long power = 1;

                    for (int j = 1; j <= digitCount; j++) {
                        power *= digit;
                    }

                    sum += power;
                    temp /= 10;
                }

                if (number == sum) {
                    System.out.println(number);
                    armstrongFound = true;
                }
            }

            if (!armstrongFound) {
                System.out.println("No Armstrong numbers found in this range.");
            }
        }
    }
}
