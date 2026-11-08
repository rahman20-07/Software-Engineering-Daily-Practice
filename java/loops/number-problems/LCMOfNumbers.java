package loops.numberproblems;

import java.util.Scanner;

public class LCMOfNumbers {

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

            long multiple = Math.max(number1, number2);

            while (multiple % number1 != 0 ||
                   multiple % number2 != 0) {

                multiple++;
            }

            System.out.println("LCM is: " + multiple);
        }
    }
}
