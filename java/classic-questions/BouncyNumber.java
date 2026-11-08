package classicquestions;

import java.util.Scanner;

public class BouncyNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 100) {
                System.out.println(number + " is not a Bouncy Number.");
                return;
            }

            int temp = number;

            int previousDigit = temp % 10;
            temp /= 10;

            boolean hasIncreasing = false;
            boolean hasDecreasing = false;

            while (temp > 0) {

                int currentDigit = temp % 10;

                // Comparing digits from left to right
                if (currentDigit < previousDigit) {
                    hasIncreasing = true;
                } else if (currentDigit > previousDigit) {
                    hasDecreasing = true;
                }

                if (hasIncreasing && hasDecreasing) {
                    System.out.println(number + " is a Bouncy Number.");
                    return;
                }

                previousDigit = currentDigit;
                temp /= 10;
            }

            System.out.println(number + " is not a Bouncy Number.");
        }
    }
}
