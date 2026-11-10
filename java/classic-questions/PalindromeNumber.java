package classicquestions;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Please enter the number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative numbers are not considered palindromes.");
                return;
            }

            int temp = number;
            long reverse = 0;

            while (temp > 0) {

                int digit = temp % 10;

                reverse = reverse * 10 + digit;

                temp /= 10;
            }

            if (number == reverse) {
                System.out.println(number + " is a Palindrome Number.");
            } else {
                System.out.println(number + " is not a Palindrome Number.");
            }
        }
    }
}
