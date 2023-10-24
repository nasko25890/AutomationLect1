package Homework;

import java.util.Scanner;

public class excursionDefinition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter place: ");
        String vacation = scanner.nextLine();
        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();

        switch (vacation){
            case "Beach":
                if (budget < 50){
                    System.out.println("Bulgaria is yours destination");
                }else {
                    System.out.println("Yours destination is Outside Bulgaria");
                }
                    break;
            case "Mountain":
                if (budget < 30){
                    System.out.println("Bulgaria is yours destination");
                }else {
                    System.out.println("Yours destination is Outside Bulgaria");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation.");
        }


    }
}
