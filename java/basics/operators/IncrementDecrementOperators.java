package basics.operators;

public class IncrementDecrementOperators {

    public static void main(String[] args) {

        int number = 5;

        // Pre-increment
        System.out.println("Pre-increment: " + (++number));

        // Post-increment
        System.out.println("Post-increment: " + (number++));
        System.out.println("After post-increment: " + number);

        // Pre-decrement
        System.out.println("Pre-decrement: " + (--number));

        // Post-decrement
        System.out.println("Post-decrement: " + (number--));
        System.out.println("After post-decrement: " + number);

        // Complex increment/decrement expression
        int a = -4;

        int b = (--a) + (a--) + (--a) - (a++) - (a--);

        System.out.println("Final value of a: " + a);
        System.out.println("Final value of b: " + b);
    }
}

