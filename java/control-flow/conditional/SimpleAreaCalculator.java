package controlflow.conditional;

public class SimpleAreaCalculator {

    public static void main(String[] args) {

        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");

        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(IO.readln());

        if (choice == 1) {

            System.out.print("Enter radius: ");
            double radius = Double.parseDouble(IO.readln());

            if (radius <= 0) {
                System.out.println("Radius must be positive.");
            } else {
                double area = Math.PI * radius * radius;
                System.out.println("Area of circle = " + area);
            }

        } else if (choice == 2) {

            System.out.print("Enter length: ");
            double length = Double.parseDouble(IO.readln());

            System.out.print("Enter breadth: ");
            double breadth = Double.parseDouble(IO.readln());

            if (length <= 0 || breadth <= 0) {
                System.out.println("Dimensions must be positive.");
            } else {
                double area = length * breadth;
                System.out.println("Area of rectangle = " + area);
            }

        } else if (choice == 3) {

            System.out.print("Enter base: ");
            double base = Double.parseDouble(IO.readln());

            System.out.print("Enter height: ");
            double height = Double.parseDouble(IO.readln());

            if (base <= 0 || height <= 0) {
                System.out.println("Base and height must be positive.");
            } else {
                double area = 0.5 * base * height;
                System.out.println("Area of triangle = " + area);
            }

        } else {
            System.out.println("Invalid choice. Please select 1, 2 or 3.");
        }
    }
}
