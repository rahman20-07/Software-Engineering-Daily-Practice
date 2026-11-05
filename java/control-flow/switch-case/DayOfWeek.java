package controlflow.switchcase;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number (1-7) for the day: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid input. Enter a number between 1 and 7.");
            }
        }
    }
}
