package Homework;

import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 16) {
            System.out.println("You are not eligible to work");
        }
        else {
            System.out.println("You are eligible to work.");
        }


    }
}
