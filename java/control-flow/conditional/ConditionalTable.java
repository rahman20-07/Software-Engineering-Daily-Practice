package controlflow.conditional;

import java.util.Scanner;

public class ConditionalTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int result = number * i;

            if (i <= 5) {

                System.out.println(number + " x " + i + " = "
                        + result + " ---> Small");

            } else {

                System.out.println(number + " x " + i + " = "
                        + result + " ---> Large");
            }
        }

        sc.close();
    }
}
