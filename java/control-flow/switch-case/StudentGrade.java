package controlflow.switchcase;

public class StudentGrade {

    public static void main(String[] args) {

        System.out.println("Available Grades: A, B, C, D, E");

        System.out.print("Enter your grade: ");
        String input = IO.readln().trim();

        if (input.length() != 1) {
            System.out.println("Please enter a single grade character.");
            return;
        }

        char grade = input.charAt(0);

        switch (grade) {

            case 'A', 'a' ->
                    System.out.println("Excellent");

            case 'B', 'b' ->
                    System.out.println("Very Good");

            case 'C', 'c' ->
                    System.out.println("Good");

            case 'D', 'd' ->
                    System.out.println("Needs Improvement");

            case 'E', 'e' ->
                    System.out.println("Poor");

            default ->
                    System.out.println("Invalid grade. Enter A, B, C, D or E.");
        }
    }
}
