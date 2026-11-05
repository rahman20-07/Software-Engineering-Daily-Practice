package basics.inputoutput;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        double first = Double.parseDouble(IO.readln());

        System.out.print("Enter second number: ");
        double second = Double.parseDouble(IO.readln());

        System.out.print("Enter third number: ");
        double third = Double.parseDouble(IO.readln());

        double average = (first + second + third) / 3.0;

        System.out.printf("Average of three numbers: %.2f%n", average);
    }
}

