package loops.patterns;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive.");
                return;
            }

            for (int i = 1; i <= rows; i++) {

                // Left-side stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // Middle spacing
                for (int j = rows - 1; j >= i; j--) {
                    System.out.print("  ");
                }

                for (int j = rows - 1; j >= i; j--) {
                    System.out.print("  ");
                }

                // Right-side stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
