package basics.inputoutput;

public class AreaOfCircle {

    public static void main(String[] args) {

        System.out.print("Enter the radius of circle: ");

        double radius = Double.parseDouble(IO.readln());

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }

        double area = Math.PI * radius * radius;

        System.out.println("Area of circle = " + area);
    }
}

