package oop.abstraction;

import java.util.Scanner;

public class ShapeAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SHAPE CALCULATOR =====");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");

        System.out.print("Select Shape: ");
        int choice = sc.nextInt();

        Shape shape;

        switch (choice) {

            case 1 -> {

                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                if (radius <= 0) {
                    System.out.println("Radius must be greater than zero.");
                    sc.close();
                    return;
                }

                shape = new Circle("Circle", radius);
            }

            case 2 -> {

                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                if (length <= 0 || breadth <= 0) {
                    System.out.println(
                            "Length and breadth must be greater than zero."
                    );
                    sc.close();
                    return;
                }

                shape = new Rectangle("Rectangle", length, breadth);
            }

            default -> {
                System.out.println("Please select a valid option!");
                sc.close();
                return;
            }
        }

        // Runtime polymorphism
        shape.displayDetails();

        sc.close();
    }
}

abstract class Shape {

    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract methods
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    // Concrete method
    public void displayDetails() {

        System.out.println("\n===== SHAPE DETAILS =====");
        System.out.println("Shape Name: " + shapeName);

        System.out.printf("Area: %.2f%n", calculateArea());

        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(String shapeName, double radius) {

        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(String shapeName, double length, double breadth) {

        super(shapeName);

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {

        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * (length + breadth);
    }
}
