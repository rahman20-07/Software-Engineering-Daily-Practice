package oop.inheritance.hierarchical;

import java.util.Scanner;

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Shape: Circle or Rectangle");
        String shape = sc.next();

        System.out.println("Enter Color:");
        String color = sc.next();

        Shape s = null;

        if (shape.equalsIgnoreCase("Circle")) {

            System.out.println("Enter Radius:");
            double radius = sc.nextDouble();

            if (radius <= 0) {
                System.out.println("Invalid Radius!");
                sc.close();
                return;
            }

            s = new Circle(color, radius);

        } else if (shape.equalsIgnoreCase("Rectangle")) {

            System.out.println("Enter Length and Breadth:");
            double length = sc.nextDouble();
            double breadth = sc.nextDouble();

            if (length <= 0 || breadth <= 0) {
                System.out.println("Invalid Dimensions!");
                sc.close();
                return;
            }

            s = new Rectangle(color, length, breadth);

        } else {

            System.out.println("Invalid Shape!");
            sc.close();
            return;
        }

        s.displayDetails();

        System.out.printf("Area: %.2f%n", s.calculateArea());

        sc.close();
    }
}

class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public void displayDetails() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {

        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public void displayDetails() {

        System.out.println("Shape: Circle");
        super.displayDetails();
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(String color, double length, double breadth) {

        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {

        return length * breadth;
    }

    @Override
    public void displayDetails() {

        System.out.println("Shape: Rectangle");
        super.displayDetails();
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}
