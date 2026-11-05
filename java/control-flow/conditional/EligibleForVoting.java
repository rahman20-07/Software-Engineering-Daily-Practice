package controlflow.conditional;

import java.util.Scanner;

public class EligibleForVoting {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Age cannot be negative.");
                return;
            }

            if (age >= 18) {
                System.out.println("Eligible for voting.");
            } else {
                System.out.println("Not eligible for voting.");
            }
        }
    }
}
