package basics.operators;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {

        int number = 10;

        // Addition assignment
        number += 20;
        System.out.println("After += : " + number);

        // Subtraction assignment
        number -= 10;
        System.out.println("After -= : " + number);

        // Multiplication assignment
        number *= 2;
        System.out.println("After *= : " + number);

        // Division assignment
        number /= 4;
        System.out.println("After /= : " + number);

        // Modulus assignment
        number %= 3;
        System.out.println("After %= : " + number);
    }
}

