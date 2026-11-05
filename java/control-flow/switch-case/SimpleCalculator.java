package controlflow.switchcase;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Select 1 to 4.");
                return;
            }

            System.out.print("Enter first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = scanner.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println(
                        "Addition = " + (firstNumber + secondNumber)
                    );
                    break;

                case 2:
                    System.out.println(
                        "Subtraction = " + (firstNumber - secondNumber)
                    );
                    break;

                case 3:
                    System.out.println(
                        "Multiplication = " + (firstNumber * secondNumber)
                    );
                    break;

                case 4:
                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println(
                            "Division = " + (firstNumber / secondNumber)
                        );
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
