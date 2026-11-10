package classicquestions;

import java.util.Scanner;

public class DuckNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            int temp = number;
            boolean isDuck = false;

            while (temp > 0) {

                int digit = temp % 10;

                if (digit == 0) {
                    isDuck = true;
                    break;
                }

                temp /= 10;
            }

            if (isDuck) {
                System.out.println(number + " is a Duck Number.");
            } else {
                System.out.println(number + " is not a Duck Number.");
            }
        }
    }
}
