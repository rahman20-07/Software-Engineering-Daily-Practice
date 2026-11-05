package controlflow.switchcase;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();

            double convertedTemperature;

            if (choice == 1) {

                convertedTemperature =
                        (temperature * 9.0 / 5.0) + 32;

                System.out.printf(
                        "Temperature in Fahrenheit: %.2f°F%n",
                        convertedTemperature
                );

            } else if (choice == 2) {

                convertedTemperature =
                        (temperature - 32) * 5.0 / 9.0;

                System.out.printf(
                        "Temperature in Celsius: %.2f°C%n",
                        convertedTemperature
                );

            } else {
                System.out.println("Invalid choice. Select 1 or 2.");
            }
        }
    }
}
