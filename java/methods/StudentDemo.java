package methods;

public class StudentDemo {

    // Static variable: belongs to the class
    private static String collegeName = "ABC College";

    // Instance variables: belong to each object
    private String studentName = "Ramesh";
    private int rollNumber = 23;

    // Static method
    public static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    // Instance method
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
    }

    public static void main(String[] args) {

        // Calling static method using class name
        StudentDemo.displayCollege();

        // Creating an object
        StudentDemo student = new StudentDemo();

        // Calling instance method using object reference
        student.displayStudentDetails();
    }
}
