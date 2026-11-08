package classicquestions;

import java.util.Scanner;

public class HCFOfNumbers {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int number2 = scanner.nextInt();

            if (number1 <= 0 || number2 <= 0) {
                System.out.println("Please enter positive numbers.");
                return;
            }

            int hcf = 1;
            int limit = Math.min(number1, number2);

            for (int divisor = 1; divisor <= limit; divisor++) {

                if (number1 % divisor == 0 &&
                    number2 % divisor == 0) {

                    hcf = divisor;
                }
            }

            System.out.println("HCF = " + hcf);
        }
    }
}
