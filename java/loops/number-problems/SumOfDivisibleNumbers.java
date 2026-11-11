package loops.numberproblems;

import java.util.Scanner;

public class SumOfDivisibleNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();

        System.out.print("Enter a divisor: ");
        int divisor = sc.nextInt();

        int sum = 0;

        if (limit < 1) {

            System.out.println("Limit must be greater than 0.");

        } else if (divisor == 0) {

            System.out.println("Divisor cannot be zero.");

        } else {

            for (int i = 1; i <= limit; i++) {

                if (i % divisor == 0) {
                    sum += i;
                }
            }

            System.out.println("Required Sum = " + sum);
        }

        sc.close();
    }
}
