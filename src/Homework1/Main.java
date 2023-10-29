package Homework1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       //sumArrayElements();
       //print2dMatrix();
       //print2dDinamicMatrix();
       //findBiggestElementInArray();
       //Reverse the order of the elements in a LinkedList using algorithm
       // reverseLinkedList();
       // sumOfMatrixDiagonals();
       // palindromeCheck();
        int result = findSmallestNumberFromThreeNumbers(100, 11, 15);
        System.out.println(result);
    }

    private static int findSmallestNumberFromThreeNumbers(int x, int y, int z) {
        int smallest = x;
        if(y< x && y < z) {
            smallest = y;
        } else if (z<x && z<y) {
            smallest = z;
        }
        System.out.println("The result is ");
        return smallest;
    }

    private static void palindromeCheck() {

        String word = "TEMA";
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);

        }
     if(word.equals(reverseWord)){
         System.out.println("The word is palindrome");
     }else {
         System.out.println("The word is not palindrome");
     }
    }

    private static void sumOfMatrixDiagonals() {
        //Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns

        int [][] numbers = {
                {1, 2, 3, 1},
                {5, 6, 7, 1},
                {3, 5, 1, 9},
                {5, 1, 7, 8}

        };

        int sumOfDiagonals = 0;
        int sumOfSecondDiagonal = 0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j){
                    sumOfDiagonals += numbers[i][j];
                }

            }

        }
        System.out.println("The sum of the first diagonals is " + sumOfDiagonals);

        for (int row = numbers.length -1; row >=0  ; row--) {
            for (int col = 0; col < numbers.length  ; col++)
                if (row + col == numbers.length - 1) {
                    sumOfSecondDiagonal += numbers[row][col];
                }

        }
        System.out.println("The sum of the second diagonals is " + sumOfSecondDiagonal);
    }

    private static void reverseLinkedList() {

        LinkedList<Integer> cars = new LinkedList<Integer>();
        cars.add(5);
        cars.add(8);
        cars.add(9);
        cars.add(10);
        System.out.println (cars);

        for (int i = 0; i < cars.size() / 2 ; i++) {
            int temp = cars.get(i);
            cars.set(i, cars.get(cars.size() - 1 - i));
            cars.set(cars.size() - 1 - i, temp );

        }
        System.out.println (cars);

    }

    private static void findBiggestElementInArray() {

        int[] myNum = {3, -9, 2, -40};
        int maxNumber = 0;
        for (int i = 0; i < myNum.length -1; i++) {
            if(myNum[i] > maxNumber){
                maxNumber = myNum[i];

            }

        }
        System.out.printf("The biggest element in the array is %d", maxNumber);


    }

    private static void print2dDinamicMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns");
        int col = scanner.nextInt();

        System.out.println("Enter array elements : ");

        int [] [] numbers = new int[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {

                numbers[i][j]=scanner.nextInt();

            }
            
       }
        System.out.print("\nData you entered : \n");

        for (int []x: numbers) {
            for (int y: x)
                  {
                      System.out.print(y + " ");
            }
            System.out.println();

        }



    }

    private static void sumArrayElements() {
        int[] array = {5, 5, 16, 4};
        int sumOfArrayElements = 0;
        for (int j : array) {
            sumOfArrayElements += j;

        }
        System.out.printf("The sum is %d", sumOfArrayElements);

    }

    private static void print2dMatrix() {
        //Print elements of a given 2
        //d matrix with 4 rows and 3 columns

        String[][] cars = {
                {"Volvo", "BMW", "Ford", "Mazda"},
                {"Audi", "Reno", "Citroen", "Ferrari"},
                {"Karuca", "Trabant", "Polo", "Alfa Romeo"}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

    }
}
