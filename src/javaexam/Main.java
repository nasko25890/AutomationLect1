package javaexam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printPineTree();
        printTriangleArea();

        printName();


        printTrianglePerimeterInput();

    }

    private static void printTrianglePerimeterInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a size");
        float a = scanner.nextFloat();

        System.out.println("Enter side b size");
        float b = scanner.nextFloat();

        System.out.println("Enter side c size");
        float c = scanner.nextFloat();

        float perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);

    }

    private static void printName() {

        String firstName = "Pesho";
        String middleName = "Petrov";
        String lastName = "Petrov";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);

    }

    private static void printPineTree() {

        char asterisk = '*';
        System.out.println("     " + asterisk);
        System.out.println("    " + asterisk + " " + asterisk);
        System.out.println("   " + asterisk + " " + asterisk + " " + asterisk);

    }

    public static void printTriangleArea() {
        float a = 5.1F;
        float h = 2.4F;

        float triangleArea = (a * h) / 2;

        System.out.println("The area of triangle is: " + triangleArea);
    }


}
