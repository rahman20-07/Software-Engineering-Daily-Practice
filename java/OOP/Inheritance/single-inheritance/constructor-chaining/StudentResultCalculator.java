package oop.inheritance.constructorchaining;

import java.util.Scanner;

public class StudentResultCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number, Name and Three Subject Marks:");

        int rollNumber = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();

        Student s = new Student(rollNumber, name, mark1, mark2, mark3);

        s.displayDetails();

        sc.close();
    }
}

class Student {

    private int rollNumber;
    private String name;

    private int mark1;
    private int mark2;
    private int mark3;

    // Constructor 1
    public Student(int rollNumber, String name) {

        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Constructor 2 - Constructor Chaining
    public Student(int rollNumber, String name,
                   int mark1, int mark2, int mark3) {

        this(rollNumber, name);

        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateTotal() {

        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {

        return calculateTotal() / 3.0;
    }

    public void displayDetails() {

        System.out.println("\n----- Student Result -----");

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);

        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);

        System.out.println("Total Marks: " + calculateTotal());

        System.out.printf("Average Marks: %.2f%n",
                calculateAverage());
    }
}
