package loops.numberproblems;

import java.util.Scanner;

public class EvenNumbersInRange {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter minimum value: ");
            int minimum = scanner.nextInt();

            System.out.print("Enter maximum value: ");
            int maximum = scanner.nextInt();

            if (minimum > maximum) {
                System.out.println("Minimum value cannot exceed maximum value.");
                return;
            }

            System.out.println(
                    "Even numbers between " + minimum + " and " + maximum + ":"
            );

            boolean evenFound = false;

            for (int number = minimum; number <= maximum; number++) {

                if (number % 2 == 0) {
                    System.out.println(number);
                    evenFound = true;
                }
            }

            if (!evenFound) {
                System.out.println("No even numbers found in this range.");
            }
        }
    }
}
