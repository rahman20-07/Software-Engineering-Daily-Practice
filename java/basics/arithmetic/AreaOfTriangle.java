package basics.arithmetic;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the base of triangle: ");
            double base = sc.nextDouble();

            System.out.print("Enter the height of triangle: ");
            double height = sc.nextDouble();

            if (base <= 0 || height <= 0) {
                System.out.println("Base and height must be positive.");
                return;
            }

            double area = 0.5 * base * height;

            System.out.println("Area of triangle = " + area);
        }
    }
}

