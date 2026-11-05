package basics.inputoutput;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        double firstNumber = Double.parseDouble(IO.readln());

        System.out.print("Enter the second number: ");
        double secondNumber = Double.parseDouble(IO.readln());

        double product = firstNumber * secondNumber;

        System.out.println("Product = " + product);
    }
}

