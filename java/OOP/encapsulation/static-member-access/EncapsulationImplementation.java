package oop.encapsulation.staticmember;

public class EncapsulationImplementation {

    public static void main(String[] args) {

        Sweta.displayBalance();

    }
}

class Arun {

    private static double balance = 5000;

    public static double getBalance() {

        return balance;
    }
}

class Sweta extends Arun {

    public static void displayBalance() {

        System.out.println("Account Balance: " + getBalance());

    }
}
