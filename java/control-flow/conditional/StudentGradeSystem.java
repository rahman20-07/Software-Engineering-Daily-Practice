package controlflow.conditional;

import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your marks (0-100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Enter marks between 0 and 100.");

            } else if (marks >= 90) {
                System.out.println("Grade - A");

            } else if (marks >= 75) {
                System.out.println("Grade - B");

            } else if (marks >= 60) {
                System.out.println("Grade - C");

            } else if (marks >= 40) {
                System.out.println("Grade - D");

            } else {
                System.out.println("Fail");
            }
        }
    }
}
