package classicquestions;

import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive number.");
                return;
            }

            int temp = number;

            while (temp != 1 && temp != 4) {

                int sum = 0;

                while (temp > 0) {

                    int digit = temp % 10;

                    sum += digit * digit;

                    temp /= 10;
                }

                temp = sum;
            }

            if (temp == 1) {
                System.out.println(number + " is a Happy Number.");
            } else {
                System.out.println(number + " is not a Happy Number.");
            }
        }
    }
}
