package basics.arithmetic;

import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter radius of cylinder: ");
            double radius = sc.nextDouble();

            System.out.print("Enter height of cylinder: ");
            double height = sc.nextDouble();

            if (radius <= 0 || height <= 0) {
                System.out.println("Radius and height must be positive.");
                return;
            }

            double volume = Math.PI * radius * radius * height;

            System.out.println("Volume of cylinder = " + volume);
        }
    }
}

