package basics.operators;

public class BitwiseNotOperator {

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 6;
        int number3 = 7;

        // Bitwise NOT operator
        System.out.println("Bitwise NOT of " + number1 + " = " + (~number1));

        System.out.println("Bitwise NOT of " + number2 + " = " + (~number2));

        System.out.println("Bitwise NOT of " + number3 + " = " + (~number3));
    }
}

