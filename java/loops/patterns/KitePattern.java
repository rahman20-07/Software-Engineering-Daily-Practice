package loops.patterns;

import java.util.Scanner;

public class KitePattern {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive.");
                return;
            }

            // Upper half
            for (int i = 1; i <= rows; i++) {

                for (int k = rows - 1; k >= i; k--) {
                    System.out.print("  ");
                }

                for (int j = 2; j <= i; j++) {
                    System.out.print("* ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            // Lower half
            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }

                for (int k = rows - 1; k >= i; k--) {
                    System.out.print("* ");
                }

                for (int k = rows - 2; k >= i; k--) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
