package classicquestions;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Negative numbers are not allowed.");
                return;
            }

            long temp = number;
            long sum = 0;

            while (temp > 0) {

                int digit = (int) (temp % 10);

                temp /= 10;

                long factorial = 1;

                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                sum += factorial;
            }

            if (number == sum) {
                System.out.println(number + " is a Strong Number.");
            } else {
                System.out.println(number + " is not a Strong Number.");
            }
        }
    }
}
