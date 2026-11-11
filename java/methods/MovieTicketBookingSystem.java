package methods;

public class MovieTicketBookingSystem {

    public static void main(String[] args) {

        MovieBooking m1 = new MovieBooking();

        MovieBooking m2 = new MovieBooking();

        // First booking
        m1.customerName = "Ibrahim";
        m1.movieName = "Avengers";
        m1.numberOfTickets = 5;

        // Second booking
        m2.customerName = "Aryan";
        m2.movieName = "Piyawa Chinra Ba";
        m2.numberOfTickets = 10;

        // Static method called using class name
        MovieBooking.displayTheatreDetails();

        System.out.println("\n===== BOOKING 1 =====");

        m1.displayBookingDetails();

        System.out.printf("Total Amount: Rs. %.2f%n",
                m1.calculateTotalAmount());

        System.out.println("\n===== BOOKING 2 =====");

        m2.displayBookingDetails();

        System.out.printf("Total Amount: Rs. %.2f%n",
                m2.calculateTotalAmount());
    }
}

class MovieBooking {

    // Static members shared by all objects
    static String theatreName = "Prakash Theatre";
    static double ticketPrice = 200.0;

    // Instance members
    String customerName;
    String movieName;
    int numberOfTickets;

    public static void displayTheatreDetails() {

        System.out.println("Theatre Name: " + theatreName);

        System.out.printf("Ticket Price: Rs. %.2f%n", ticketPrice);
    }

    public void displayBookingDetails() {

        System.out.println("Customer Name: " + customerName);

        System.out.println("Movie Name: " + movieName);

        System.out.println("Number of Tickets: " + numberOfTickets);
    }

    public double calculateTotalAmount() {

        if (numberOfTickets <= 0) {

            return 0.0;
        }

        return numberOfTickets * ticketPrice;
    }
}
