package loops.numberproblems;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of terms: ");
            int terms = scanner.nextInt();

            if (terms <= 0) {
                System.out.println("Number of terms must be positive.");
                return;
            }

            long a = 0;
            long b = 1;

            if (terms >= 1) {
                System.out.print(a + " ");
            }

            if (terms >= 2) {
                System.out.print(b + " ");
            }

            for (int i = 3; i <= terms; i++) {

                long sum = a + b;

                a = b;
                b = sum;

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}
