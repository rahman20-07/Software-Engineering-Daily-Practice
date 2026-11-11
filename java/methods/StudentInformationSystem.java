package methods;

public class StudentInformationSystem {

    public static void main(String[] args) {

        // Creating first student object
        Student student1 = new Student(45, "Rahman", 90);

        // Creating second student object
        Student student2 = new Student(79, "Vaibhaw", 80);

        // Calling static method using class name
        Student.displayCollegeDetails();

        // Calling instance methods using object references
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}

class Student {

    // Static variables: common for all students
    private static String collegeName = "Jamia Hamdard University";
    private static String courseName = "Computer Science";

    // Instance variables: separate for every student
    private int studentId;
    private String studentName;
    private double marks;

    // Parameterized constructor
    Student(int studentId, String studentName, double marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    // Static method
    public static void displayCollegeDetails() {

        System.out.println("----- COLLEGE DETAILS -----");
        System.out.println("College Name: " + collegeName);
        System.out.println("Course Name: " + courseName);
        System.out.println();
    }

    // Instance method
    public void displayStudentDetails() {

        System.out.println("----- STUDENT DETAILS -----");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}
