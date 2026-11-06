import java.util.Scanner;

public class ParcelDeliveryCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String parcelID = sc.nextLine();
        String senderName = sc.nextLine();
        String receiverName = sc.nextLine();

        double weightKg = sc.nextDouble();
        double distanceKm = sc.nextDouble();
        double ratePerKgKm = sc.nextDouble();

        // Input validation
        if (weightKg <= 0 || distanceKm <= 0 || ratePerKgKm < 0) {
            System.out.println("Error: Invalid parcel details.");
            sc.close();
            return;
        }

        Parcel parcel = new Parcel(
                parcelID,
                senderName,
                receiverName,
                weightKg,
                distanceKm,
                ratePerKgKm
        );

        parcel.displayParcelDetails();

        sc.close();
    }
}

class Parcel {

    private String parcelID;
    private String senderName;
    private String receiverName;

    private double weightKg;
    private double distanceKm;
    private double ratePerKgKm;

    Parcel(String parcelID, String senderName,
           String receiverName, double weightKg,
           double distanceKm, double ratePerKgKm) {

        this.parcelID = parcelID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.ratePerKgKm = ratePerKgKm;
    }

    double calculateDeliveryCost() {

        return weightKg * distanceKm * ratePerKgKm;
    }

    void displayParcelDetails() {

        System.out.println("Parcel ID: " + parcelID);
        System.out.println("Sender: " + senderName);
        System.out.println("Receiver: " + receiverName);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Rate per kg/km: " + ratePerKgKm);

        System.out.printf(
                "Total Delivery Cost: %.2f%n",
                calculateDeliveryCost()
        );
    }
}
