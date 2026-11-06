import java.util.Scanner;

public class CarDetailsUsingInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String vehicleNumber = sc.nextLine();
        String ownerName = sc.nextLine();
        int mileage = sc.nextInt();

        // Input validation
        if (mileage <= 0) {
            System.out.println("Error: Mileage must be greater than or equal to 0");
            sc.close();
            return;
        }

        Car car = new Car(vehicleNumber, ownerName, mileage);

        car.displayCarDetails();

        sc.close();
    }
}

class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private int mileage;

    Vehicle(String vehicleNumber, String ownerName, int mileage) {

        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.mileage = mileage;
    }

    protected void displayVehicleDetails() {

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Mileage: " + mileage + " km");
    }
}

class Car extends Vehicle {

    private final String type = "Car";

    Car(String vehicleNumber, String ownerName, int mileage) {

        super(vehicleNumber, ownerName, mileage);
    }

    void displayCarDetails() {

        super.displayVehicleDetails();

        System.out.println("Type: " + type);
    }
}
