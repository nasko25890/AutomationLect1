package Homework;

import java.util.Scanner;

public class RevenueFromSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your price: ");
        int price = scanner.nextInt();
        System.out.print("Enter your quantity: ");
        int quantity = scanner.nextInt();
        double revenue;
        double discount;

        if(quantity < 100) {
            revenue = price * quantity;
            System.out.printf("The revenue from sale: " + revenue + "$");

        } else if (quantity <=120) {
            revenue = (price * quantity) * 0.85;
            discount = (price * quantity) * 0.15;
            System.out.println("The revenue from sale: " + revenue + "$");
            System.out.println("Discount:" + discount + "$(15.0%)");
        }
        else {
            revenue = (price * quantity) * 0.80;
            discount = (price * quantity) * 0.20;
            System.out.println("The revenue from sale: " + revenue + "$");
            System.out.println("Discount:" + discount + "$(20.0%)");
        }
    }
}
