package controlflow.switchcase;

import java.util.Scanner;

public class MenuPrice {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Idli  - Rs. 40");
            System.out.println("2. Dosa  - Rs. 60");
            System.out.println("3. Poori - Rs. 50");
            System.out.println("4. Vada  - Rs. 30");
            System.out.println("5. Meals - Rs. 100");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            String itemName;
            int price;

            switch (choice) {

                case 1:
                    itemName = "Idli";
                    price = 40;
                    break;

                case 2:
                    itemName = "Dosa";
                    price = 60;
                    break;

                case 3:
                    itemName = "Poori";
                    price = 50;
                    break;

                case 4:
                    itemName = "Vada";
                    price = 30;
                    break;

                case 5:
                    itemName = "Meals";
                    price = 100;
                    break;

                default:
                    System.out.println("Invalid menu choice.");
                    return;
            }

            System.out.print("Enter number of plates: ");
            int plates = scanner.nextInt();

            if (plates <= 0) {
                System.out.println("Number of plates must be positive.");
                return;
            }

            int totalBill = price * plates;

            System.out.println("You selected: " + itemName);
            System.out.println("Price per plate: Rs. " + price);
            System.out.println("Number of plates: " + plates);
            System.out.println("Total bill: Rs. " + totalBill);
        }
    }
}
