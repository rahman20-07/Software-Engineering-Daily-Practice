package loops.numberproblems;

import java.util.Scanner;

public class PrintNumbersInRange {

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

            for (int number = minimum; number <= maximum; number++) {
                System.out.println(number);
            }
        }
    }
}
