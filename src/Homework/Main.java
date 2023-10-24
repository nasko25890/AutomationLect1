package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //divisibleByFiveArrayNumbers();
        reverseArray();
    }

    private static void reverseArray() {

        int[] list1 = {10, 20, 30, 40, 50};

        for (int i = list1.length -1; i >= 0 ; i -= 1) {
            System.out.print(list1[i] + " ");
        }

    }

    private static void divisibleByFiveArrayNumbers() {
        Scanner scanner = new Scanner(System.in);

        int[]  list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < list1.length; i++) {
            if(list1[i] > 150) {
                break;
            } else if (list1[i] % 5 == 0){

                System.out.print(list1[i] + " ");
            }
        }

    }
}
