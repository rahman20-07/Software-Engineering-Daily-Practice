package controlflow.conditional;

import java.util.Scanner;

public class GradeCategory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks between 1 and 100: ");
        int marks = sc.nextInt();

        if (marks < 1 || marks > 100) {

            System.out.println("Invalid marks! Enter marks between 1 and 100.");

        } else if (marks >= 90) {

            System.out.println("Grade - A");

        } else if (marks >= 80) {

            System.out.println("Grade - B");

        } else if (marks >= 70) {

            System.out.println("Grade - C");

        } else if (marks >= 60) {

            System.out.println("Grade - D");

        } else if (marks >= 50) {

            System.out.println("Grade - E");

        } else if (marks >= 40) {

            System.out.println("Grade - F");

        } else {

            System.out.println("Sorry, you failed.");
        }

        sc.close();
    }
}
