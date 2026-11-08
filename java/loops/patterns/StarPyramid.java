package loops.patterns;

import java.util.Scanner;

public class StarPyramid {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive.");
                return;
            }

            for (int i = 1; i <= rows; i++) {

                // Print leading spaces
                for (int k = rows - 1; k >= i; k--) {
                    System.out.print("  ");
                }

                // Print left-side stars
                for (int j = 2; j <= i; j++) {
                    System.out.print("* ");
                }

                // Print right-side stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
