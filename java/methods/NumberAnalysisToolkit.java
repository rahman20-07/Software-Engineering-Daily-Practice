package methods;

import java.util.Scanner;

public class NumberAnalysisToolkit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {

            System.out.println("Please enter a positive number.");

        } else {

            displayAnalysis(number);
        }

        sc.close();
    }

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {

            count++;

            number /= 10;
        }

        return count;
    }

    public static int findSumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {

            sum += number % 10;

            number /= 10;
        }

        return sum;
    }

    public static int reverseNumber(int number) {

        int reversed = 0;

        while (number > 0) {

            int digit = number % 10;

            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return reversed;
    }

    public static boolean isPalindrome(int number) {

        return number == reverseNumber(number);
    }

    public static void displayAnalysis(int number) {

        System.out.println("\n===== NUMBER ANALYSIS =====");

        System.out.println("Original number: " + number);

        System.out.println("Number of digits: " + countDigits(number));

        System.out.println("Sum of digits: " + findSumOfDigits(number));

        System.out.println("Reversed number: " + reverseNumber(number));

        System.out.println("Is palindrome: " + isPalindrome(number));

        System.out.println("===========================");
    }
}
