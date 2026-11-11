package methods;

import java.util.Scanner;

public class IntegerStatisticsAndDigitPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {

            System.out.println("Please enter a positive number greater than zero.");

        } else {

            displayAnalysis(num);
        }

        sc.close();
    }

    public static int findFirstDigit(int number) {

        while (number >= 10) {

            number /= 10;
        }

        return number;
    }

    public static int findLastDigit(int number) {

        return number % 10;
    }

    public static int countEvenDigits(int number) {

        int count = 0;

        while (number > 0) {

            int digit = number % 10;

            if (digit % 2 == 0) {

                count++;
            }

            number /= 10;
        }

        return count;
    }

    public static int findProductOfDigits(int number) {

        int product = 1;

        while (number > 0) {

            int digit = number % 10;

            product *= digit;

            number /= 10;
        }

        return product;
    }

    public static boolean isIncreasingNumber(int number) {

        int previous = number % 10;

        number /= 10;

        while (number > 0) {

            int digit = number % 10;

            if (digit >= previous) {

                return false;
            }

            previous = digit;

            number /= 10;
        }

        return true;
    }

    public static void displayAnalysis(int number) {

        System.out.println("\n===== INTEGER ANALYSIS =====");

        System.out.println("First digit: " + findFirstDigit(number));

        System.out.println("Last digit: " + findLastDigit(number));

        System.out.println("Even digit count: " + countEvenDigits(number));

        System.out.println("Product of digits: " + findProductOfDigits(number));

        System.out.println("Strictly increasing digits: " + isIncreasingNumber(number));

        System.out.println("============================");
    }
}
