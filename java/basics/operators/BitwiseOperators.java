package basics.operators;

public class BitwiseOperators {

    public static void main(String[] args) {

        int firstNumber = 5;
        int secondNumber = 3;

        // Bitwise AND
        System.out.println("Bitwise AND: " +
                (firstNumber & secondNumber));

        // Bitwise OR
        System.out.println("Bitwise OR: " +
                (firstNumber | secondNumber));

        // Bitwise XOR
        System.out.println("Bitwise XOR: " +
                (firstNumber ^ secondNumber));
    }
}

