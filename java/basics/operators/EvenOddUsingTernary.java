package basics.operators;

public class EvenOddUsingTernary {

    public static void main(String[] args) {

        int number = 11;

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(number + " is " + result);
    }
}

