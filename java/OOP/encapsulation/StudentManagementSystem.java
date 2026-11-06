package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID, Name, English Marks, Maths Marks, Science Marks:");

        int studentId = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        String studentName = sc.nextLine();

        int englishMarks = sc.nextInt();
        int mathsMarks = sc.nextInt();
        int scienceMarks = sc.nextInt();

        try {

            Student student = new Student(
                    studentId,
                    studentName,
                    englishMarks,
                    mathsMarks,
                    scienceMarks
            );

            student.displayDetails();

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }

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
                   int englishMarks, int mathsMarks,
                   int scienceMarks) {

        this.studentId = studentId;
        this.studentName = studentName;

        setEnglishMarks(englishMarks);
        setMathsMarks(mathsMarks);
        setScienceMarks(scienceMarks);
    }

    // Getters and Setters

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

        if (englishMarks < 0 || englishMarks > 100) {
            throw new IllegalArgumentException(
                    "English marks must be between 0 and 100"
            );
        }

        this.englishMarks = englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {

        if (mathsMarks < 0 || mathsMarks > 100) {
            throw new IllegalArgumentException(
                    "Maths marks must be between 0 and 100"
            );
        }

        this.mathsMarks = mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {

        if (scienceMarks < 0 || scienceMarks > 100) {
            throw new IllegalArgumentException(
                    "Science marks must be between 0 and 100"
            );
        }

        this.scienceMarks = scienceMarks;
    }

    // Calculation Methods

    public int calculateTotal() {

        return englishMarks + mathsMarks + scienceMarks;
    }

    public double calculateAverage() {

        return calculateTotal() / 3.0;
    }

    public char calculateGrade() {

        double average = calculateAverage();

        if (average >= 75) return 'A';
        else if (average >= 60) return 'B';
        else if (average >= 50) return 'C';
        else if (average >= 40) return 'D';
        else return 'F';
    }

    // Display Method

    public void displayDetails() {

        System.out.println("\n----- Student Details -----");

        System.out.println("Student ID: " + getStudentId());
        System.out.println("Student Name: " + getStudentName());

        System.out.println("English Marks: " + getEnglishMarks());
        System.out.println("Maths Marks: " + getMathsMarks());
        System.out.println("Science Marks: " + getScienceMarks());

        System.out.println("Total Marks: " + calculateTotal());

        System.out.printf(
                "Average Marks: %.2f%n",
                calculateAverage()
        );

        System.out.println("Final Grade: " + calculateGrade());
    }
}
