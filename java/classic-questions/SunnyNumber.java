package classicquestions;

import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
                return;
            }

            long successor = (long) number + 1;

            boolean isSunny = false;

            for (long i = 1; i <= successor / i; i++) {

                if (i * i == successor) {
                    isSunny = true;
                    break;
                }
            }

            if (isSunny) {
                System.out.println(number + " is a Sunny Number.");
            } else {
                System.out.println(number + " is not a Sunny Number.");
            }
        }
    }
}
