package testPackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = newScanner.nextLine();
        System.out.println(name);

    }
}
