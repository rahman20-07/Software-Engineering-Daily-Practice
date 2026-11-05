package controlflow.switchcase;

import java.util.Scanner;

public class SwitchCaseDirection {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. East");
            System.out.println("2. West");
            System.out.println("3. North");
            System.out.println("4. South");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("East");
                    break;

                case 2:
                    System.out.println("West");
                    break;

                case 3:
                    System.out.println("North");
                    break;

                case 4:
                    System.out.println("South");
                    break;

                default:
                    System.out.println("Invalid direction choice.");
            }
        }
    }
}
