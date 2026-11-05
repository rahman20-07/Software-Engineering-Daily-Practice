package basics.inputoutput;

public class TakeInput {

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        int firstNumber = Integer.parseInt(IO.readln());

        System.out.print("Enter the second number: ");
        int secondNumber = Integer.parseInt(IO.readln());

        int sum = firstNumber + secondNumber;

        System.out.println("Sum = " + sum);
    }
}

