package basics.arithmetic;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter principal amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter rate of interest: ");
            double rate = sc.nextDouble();

            System.out.print("Enter time duration: ");
            double time = sc.nextDouble();

            if (principal < 0 || rate < 0 || time < 0) {
                System.out.println("Values cannot be negative.");
                return;
            }

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("Simple Interest = " + simpleInterest);
        }
    }
}

