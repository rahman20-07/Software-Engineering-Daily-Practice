package basics.operators;

public class ShiftOperators {

    public static void main(String[] args) {

        int number = 16;

        // Signed Right Shift
        System.out.println("Right Shift (16 >> 1): " + (number >> 1));
        System.out.println("Right Shift (16 >> 2): " + (number >> 2));
        System.out.println("Right Shift (16 >> 3): " + (number >> 3));

        // Left Shift
        System.out.println("Left Shift (4 << 1): " + (4 << 1));
        System.out.println("Left Shift (4 << 2): " + (4 << 2));
        System.out.println("Left Shift (4 << 3): " + (4 << 3));

        // Unsigned Right Shift
        System.out.println("Unsigned Right Shift (16 >>> 1): " + (16 >>> 1));
    }
}

