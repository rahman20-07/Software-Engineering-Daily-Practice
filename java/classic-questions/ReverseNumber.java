package classicquestions;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the number: ");
            int number = scanner.nextInt();

            int temp = Math.abs(number);
            long reverse = 0;

            while (temp > 0) {

                int digit = temp % 10;

                reverse = reverse * 10 + digit;

                temp /= 10;
            }

            if (number < 0) {
                reverse = -reverse;
            }

            System.out.println("Reverse is: " + reverse);
        }
    }
}
