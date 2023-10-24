package Homework;

import java.util.Scanner;

public class LargestNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] myNum = {-3, -9, 2, -40};
        int maxNumber = myNum[0];
        for (int i = 0; i < myNum.length -1; i++) {
            if(myNum[i] > maxNumber){
                maxNumber = myNum[i];

            }

        }
        System.out.println(maxNumber);
    }
}
