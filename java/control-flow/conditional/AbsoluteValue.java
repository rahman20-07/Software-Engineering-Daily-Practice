package controlflow.conditional;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                number = number * -1;
            }

            System.out.println("Absolute value = " + number);
        }
    }
}
