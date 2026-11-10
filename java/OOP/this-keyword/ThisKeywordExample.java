package oop.thiskeyword;

public class ThisKeywordExample {

    public static void main(String[] args) {

        NumberDetails d1 = new NumberDetails(10, 20, 30);
        NumberDetails d2 = new NumberDetails(40, 50, 60);
        NumberDetails d3 = new NumberDetails(70, 80, 90);

        d1.displayDetails();
        System.out.println();

        d2.displayDetails();
        System.out.println();

        d3.displayDetails();
    }
}

class NumberDetails {

    public int i;
    public int j;
    public int k;

    public NumberDetails(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    public void displayDetails() {

        int i = 100;
        int j = 200;
        int k = 300;

        System.out.println("Local i = " + i);
        System.out.println("Instance i = " + this.i);

        System.out.println("Local j = " + j);
        System.out.println("Instance j = " + this.j);

        System.out.println("Local k = " + k);
        System.out.println("Instance k = " + this.k);
    }
}
