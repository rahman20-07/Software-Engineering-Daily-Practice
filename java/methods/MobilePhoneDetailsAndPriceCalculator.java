package methods;

public class MobilePhoneDetailsAndPriceCalculator {

    public static void main(String[] args) {

        MobilePhone m1 = new MobilePhone();

        m1.modelName = "Samsung Galaxy A32";
        m1.ram = 6;
        m1.basePrice = 10000.0;

        // Calling static method using class name
        MobilePhone.displayBrandDetails();

        System.out.println("\n===== MOBILE DETAILS =====");

        // Calling instance methods using object reference
        m1.displayMobileDetails();

        double finalPrice = m1.calculateFinalPrice();

        System.out.printf("Final Price: Rs. %.2f%n", finalPrice);
    }
}

class MobilePhone {

    // Static variables shared by all mobile objects
    static String brandName = "Samsung";
    static double gstPercentage = 18.0;

    // Instance variables
    String modelName;
    int ram;
    double basePrice;

    public static void displayBrandDetails() {

        System.out.println("Mobile Brand: " + brandName);

        System.out.println("GST Percentage: " + gstPercentage + "%");
    }

    public void displayMobileDetails() {

        System.out.println("Mobile Model: " + modelName);

        System.out.println("RAM: " + ram + " GB");

        System.out.printf("Base Price: Rs. %.2f%n", basePrice);
    }

    public double calculateFinalPrice() {

        double gstAmount = (basePrice * gstPercentage) / 100;

        return basePrice + gstAmount;
    }
}
