package Homework2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //Write a Java method to compute the average of three numbers.
        
       // double result = averageOfThreeNumbers(2.5, 4.5,5);
        //System.out.println("The average of three numbers is " + result);

        //displayMiddleCharacter("System");
        //int count = countWords(" Automation course test ");
        //System.out.println(count);

        System.out.println(isEven(98));
    }

    private static boolean isEven(int number) {
        boolean isEven = false;
        if (number % 2 == 0) {
             isEven = true;
        } else {
            isEven = false;
        }


        return  isEven;

    }

    private static int countWords(String sentence) {
        String trimmedText = sentence.trim();
        int counter = 0;
        if(trimmedText.length() > 1){
            counter++;
            for (int i = 0; i < trimmedText.length(); i++) {
                if(trimmedText.charAt(i) == ' ') {
                    counter++;
                }
            }

        }



        return counter;
    }

    private static void displayMiddleCharacter(String value) {

        int lenght;
        int position;


            if(value.length() % 2 == 0) {
                position = value.length() / 2 - 1;
                lenght = 2;
            }else {
                position = value.length() / 2 ;
                lenght = 1;
            }
            System.out.println(value.substring(position, position + lenght));



    }

    private static double averageOfThreeNumbers(double number1, double number2, double number3) {
        double sum = number1 + number2 + number3;
        return sum / 3;

    }
}
