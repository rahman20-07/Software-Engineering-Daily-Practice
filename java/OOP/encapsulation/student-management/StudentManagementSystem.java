package oop.encapsulation.studentmanagement;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String studentName = sc.nextLine();

        System.out.println("Enter English, Maths and Science Marks:");

        int englishMarks = sc.nextInt();
        int mathsMarks = sc.nextInt();
        int scienceMarks = sc.nextInt();

        Student s = new Student(
            studentId, studentName,
            englishMarks, mathsMarks, scienceMarks
        );

        s.displayDetails();

        sc.close();
    }
}

class Student {

    private int studentId;
    private String studentName;

    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;

    public Student(int studentId, String studentName,
                   int englishMarks, int mathsMarks, int scienceMarks) {

        this.studentId = studentId;
        this.studentName = studentName;

        setEnglishMarks(englishMarks);
        setMathsMarks(mathsMarks);
        setScienceMarks(scienceMarks);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {

        if (englishMarks >= 0 && englishMarks <= 100) {
            this.englishMarks = englishMarks;
        } else {
            System.out.println("Invalid English Marks!");
        }
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {

        if (mathsMarks >= 0 && mathsMarks <= 100) {
            this.mathsMarks = mathsMarks;
        } else {
            System.out.println("Invalid Maths Marks!");
        }
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {

        if (scienceMarks >= 0 && scienceMarks <= 100) {
            this.scienceMarks = scienceMarks;
        } else {
            System.out.println("Invalid Science Marks!");
        }
    }

    public int calculateTotal() {

        return englishMarks + mathsMarks + scienceMarks;
    }

    public double calculateAverage() {

        return calculateTotal() / 3.0;
    }

    public char calculateGrade() {

        double avg = calculateAverage();

        if (avg >= 75) {
            return 'A';
        } else if (avg >= 60) {
            return 'B';
        } else if (avg >= 50) {
            return 'C';
        } else if (avg >= 35) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayDetails() {

        System.out.println("\n----- Student Result -----");

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);

        System.out.println("English Marks: " + englishMarks);
        System.out.println("Maths Marks: " + mathsMarks);
        System.out.println("Science Marks: " + scienceMarks);

        System.out.println("Total Marks: " + calculateTotal());

        System.out.printf("Average Marks: %.2f%n", calculateAverage());

        System.out.println("Final Grade: " + calculateGrade());
    }
}
