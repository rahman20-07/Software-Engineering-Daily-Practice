import java.util.Scanner;

public class InternationalShipmentCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String shipmentID = sc.nextLine();
        String senderName = sc.nextLine();
        String receiverName = sc.nextLine();

        double weightKg = sc.nextDouble();
        double distanceKm = sc.nextDouble();
        double baseRate = sc.nextDouble();
        double internationalSurcharge = sc.nextDouble();

        // Input validation
        if (weightKg <= 0 || distanceKm <= 0 ||
            baseRate < 0 || internationalSurcharge < 0) {

            System.out.println("Error: Invalid shipment details.");
            sc.close();
            return;
        }

        InternationalShipment shipment =
                new InternationalShipment(
                        shipmentID, senderName, receiverName,
                        weightKg, distanceKm, baseRate,
                        internationalSurcharge
                );

        shipment.displayInternationalDetails();

        sc.close();
    }
}

class Shipment {

    private String shipmentID;
    private String senderName;
    private String receiverName;

    private double weightKg;
    private double distanceKm;
    private double baseRate;

    Shipment(String shipmentID, String senderName,
             String receiverName, double weightKg,
             double distanceKm, double baseRate) {

        this.shipmentID = shipmentID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.baseRate = baseRate;
    }

    protected double calculateShippingCost() {

        return weightKg * distanceKm * baseRate;
    }

    protected void displayShipmentDetails() {

        System.out.println("Shipment ID: " + shipmentID);
        System.out.println("Sender: " + senderName);
        System.out.println("Receiver: " + receiverName);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Base Rate: " + baseRate);
    }
}

class InternationalShipment extends Shipment {

    private double internationalSurcharge;

    InternationalShipment(String shipmentID, String senderName,
                          String receiverName, double weightKg,
                          double distanceKm, double baseRate,
                          double internationalSurcharge) {

        super(shipmentID, senderName, receiverName,
              weightKg, distanceKm, baseRate);

        this.internationalSurcharge = internationalSurcharge;
    }

    protected void displayInternationalDetails() {

        displayShipmentDetails();

        double baseCost = calculateShippingCost();

        double surchargeAmount =
                baseCost * internationalSurcharge / 100.0;

        double totalCost = baseCost + surchargeAmount;

        System.out.println("International Surcharge: "
                + internationalSurcharge + "%");

        System.out.printf("Total Shipping Cost: %.2f%n", totalCost);
    }
}
