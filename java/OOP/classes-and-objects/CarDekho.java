package oop.classesandobjects;

public class CarDekho {

    public static void main(String[] args) {

        Car c = new Car();

        c.initializeCar("Swift", "Maruti Suzuki", 800000, 22.5, true);

        c.displayCarDetails();

        double discountedPrice = c.calculateDiscountedPrice(10);

        System.out.printf("Discounted Price: %.2f%n", discountedPrice);
    }
}

class Car {

    private String carModel;
    private String manufacture;
    private double price;
    private double mileage;
    private boolean availability;

    public void initializeCar(String carModel, String manufacture,
                              double price, double mileage,
                              boolean availability) {

        if (carModel == null || carModel.length() < 3) {
            System.out.println("Invalid car model!");
            return;
        }

        if (price <= 0 || mileage <= 0) {
            System.out.println("Invalid price or mileage!");
            return;
        }

        this.carModel = carModel;
        this.manufacture = manufacture;
        this.price = price;
        this.mileage = mileage;
        this.availability = availability;
    }

    public double calculateDiscountedPrice(double discountPercentage) {

        if (price <= 0 || discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid price or discount percentage!");
            return 0.0;
        }

        double discount = price * discountPercentage / 100;

        return price - discount;
    }

    public void displayCarDetails() {

        System.out.println("\n----- Car Details -----");

        System.out.println("Car Model: " + carModel);
        System.out.println("Manufacturer: " + manufacture);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Available: " + availability);
    }
}
