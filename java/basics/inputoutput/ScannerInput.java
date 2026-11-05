package basics.inputoutput;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;

            System.out.println("Sum = " + sum);
        }
    }
}

