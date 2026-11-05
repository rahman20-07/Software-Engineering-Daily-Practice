package controlflow.conditional;

import java.util.Scanner;

public class EligibleForIASExam {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Age cannot be negative.");
                return;
            }

            if (age >= 21 && age <= 32) {
                System.out.println("Eligible for IAS Exam.");
            } else {
                System.out.println("Not eligible for IAS Exam.");
            }
        }
    }
}
