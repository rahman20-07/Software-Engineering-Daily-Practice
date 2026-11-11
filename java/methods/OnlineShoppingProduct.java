package methods;

import java.util.Scanner;

public class OnlineShoppingProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product details:");

        System.out.print("Product ID: ");
        int productId = sc.nextInt();

        sc.nextLine();

        System.out.print("Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Product Quantity: ");
        int quantity = sc.nextInt();

        if (productId <= 0 || productName.isBlank()
                || price < 0 || quantity < 0) {

            System.out.println("Invalid product details.");

        } else {

            Product product = new Product(
                    productId, productName, price, quantity);

            product.displayDetails();
        }

        sc.close();
    }
}

class Product {

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Default constructor
    Product() {

        this.productId = 0;
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor 2
    Product(int productId, String productName) {

        this();

        this.productId = productId;
        this.productName = productName;
    }

    // Constructor 3
    Product(int productId, String productName, double price) {

        this(productId, productName);

        this.price = price;
    }

    // Constructor 4
    Product(int productId, String productName,
            double price, int quantity) {

        this(productId, productName, price);

        this.quantity = quantity;
    }

    public double calculateInventoryValue() {

        return price * quantity;
    }

    public void displayDetails() {

        System.out.println("\n===== PRODUCT DETAILS =====");

        System.out.println("Product ID: " + productId);

        System.out.println("Product Name: " + productName);

        System.out.printf("Price: Rs. %.2f%n", price);

        System.out.println("Quantity: " + quantity);

        System.out.printf("Inventory Value: Rs. %.2f%n",
                calculateInventoryValue());

        System.out.println("===========================");
    }
}
