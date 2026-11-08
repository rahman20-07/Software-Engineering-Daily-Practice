package loops.patterns;

import java.util.Scanner;

public class DecrementStarPattern {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of rows: ");
            int rows = scanner.nextInt();

            if (rows <= 0) {
                System.out.println("Number of rows must be positive.");
                return;
            }

            for (int i = 1; i <= rows; i++) {

                for (int j = rows; j >= i; j--) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
