package classicquestions;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a non-negative number: ");
            long number = scanner.nextLong();

            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                return;
            }

            long temp = number;

            int largest = -1;
            int secondLargest = -1;

            while (temp > 0) {

                int digit = (int) (temp % 10);

                if (digit > largest) {

                    secondLargest = largest;
                    largest = digit;

                } else if (digit < largest && digit > secondLargest) {

                    secondLargest = digit;
                }

                temp /= 10;
            }

            if (secondLargest == -1) {
                System.out.println("There is no second-largest distinct digit.");
            } else {
                System.out.println("Second-largest digit: " + secondLargest);
            }
        }
    }
}
