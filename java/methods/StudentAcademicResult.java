package methods;

import java.util.Scanner;

public class StudentAcademicResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student details:");

        System.out.print("Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Subject 1 Marks: ");
        int subject1 = sc.nextInt();

        System.out.print("Subject 2 Marks: ");
        int subject2 = sc.nextInt();

        System.out.print("Subject 3 Marks: ");
        int subject3 = sc.nextInt();

        if (!isValidMarks(subject1)
                || !isValidMarks(subject2)
                || !isValidMarks(subject3)) {

            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            sc.close();
            return;
        }

        StudentRecord student = new StudentRecord(
                rollNumber, studentName, subject1, subject2, subject3
        );

        student.calculateTotalMarks();
        student.calculateAverageMarks();
        student.determineResult();
        student.displayDetails();

        sc.close();
    }

    private static boolean isValidMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    private static class StudentRecord {

        private int rollNumber;
        private String studentName;

        private int subject1;
        private int subject2;
        private int subject3;

        private int totalMarks;
        private double averageMarks;
        private String result;

        // Constructor 1
        StudentRecord(int rollNumber, String studentName) {
            this.rollNumber = rollNumber;
            this.studentName = studentName;
        }

        // Constructor 2
        StudentRecord(int rollNumber, String studentName, int subject1) {
            this(rollNumber, studentName);
            this.subject1 = subject1;
        }

        // Constructor 3
        StudentRecord(
                int rollNumber,
                String studentName,
                int subject1,
                int subject2,
                int subject3) {

            this(rollNumber, studentName, subject1);

            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        public void calculateTotalMarks() {
            totalMarks = subject1 + subject2 + subject3;
        }

        public void calculateAverageMarks() {
            averageMarks = totalMarks / 3.0;
        }

        public void determineResult() {

            if (subject1 >= 35
                    && subject2 >= 35
                    && subject3 >= 35) {

                result = "PASS";

            } else {
                result = "FAIL";
            }
        }

        public void displayDetails() {

            System.out.println("\n----- STUDENT RESULT -----");

            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + totalMarks);

            System.out.printf("Average Marks: %.2f%n", averageMarks);

            System.out.println("Result: " + result);
        }
    }
}
