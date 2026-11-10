package classicquestions;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the number: ");
            int number = scanner.nextInt();

            long temp = Math.abs((long) number);
            int sum = 0;

            while (temp > 0) {

                int digit = (int) (temp % 10);

                sum += digit;

                temp /= 10;
            }

            System.out.println("Sum of digits is: " + sum);
        }
    }
}
