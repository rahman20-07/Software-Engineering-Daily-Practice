package loops.numberproblems;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                return;
            }

            long sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("Sum of numbers from 1 to " + number + " = " + sum);
        }
    }
}
