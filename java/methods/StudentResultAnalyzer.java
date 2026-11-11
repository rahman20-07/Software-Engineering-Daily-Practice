package methods;

import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayTitle();

        System.out.print("Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Subject 3: ");
        double m3 = sc.nextDouble();

        // Validate subject marks
        if (!isValidMarks(m1) || !isValidMarks(m2)
                || !isValidMarks(m3)) {

            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            sc.close();
            return;
        }

        double total = calculateTotal(m1, m2, m3);

        System.out.println("\nTotal Marks: " + total);

        double percentage = calculatePercentage(total);

        System.out.printf("Percentage: %.2f%%%n", percentage);

        displayResult(percentage);

        sc.close();
    }

    public static void displayTitle() {

        System.out.println("===== STUDENT RESULT ANALYZER =====");
        System.out.println("Enter marks in three subjects (out of 100):");
    }

    public static boolean isValidMarks(double marks) {

        return marks >= 0 && marks <= 100;
    }

    public static double calculateTotal(
            double m1, double m2, double m3) {

        return m1 + m2 + m3;
    }

    public static double calculatePercentage(double total) {

        return (total / 300.0) * 100.0;
    }

    public static void displayResult(double percentage) {

        if (percentage >= 75) {

            System.out.println("Result: Distinction");

        } else if (percentage >= 60) {

            System.out.println("Result: First Class");

        } else if (percentage >= 35) {

            System.out.println("Result: Pass");

        } else {

            System.out.println("Result: Fail");
        }
    }
}
