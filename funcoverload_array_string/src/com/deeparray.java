package com;
import java.util.Arrays;

public class deeparray {
     public static void main(String[] args) {
         
        int firstArray[] = {5,6,7,8,9};
        int  secondArray[] = new int[5];

        // memory address are different
        System.out.println("\nBefore declaration: ");
        System.out.println(firstArray);
        System.out.println(secondArray);
        // but when we declare this
        secondArray = firstArray;
        // it causes the memory the same
        System.out.println("After declaration: ");
        System.out.println(firstArray); 
        System.out.println(secondArray + "\n");
        // print as array
        System.out.println("Before changing the values: ");
        System.out.println("First array -> " + Arrays.toString(firstArray));
        System.out.println("Second array -> " + Arrays.toString(secondArray));
        // so because of this
        firstArray[0] = 105;
        secondArray[4] = 223;
        //both values change
        System.out.println("After changing the values: ");
        System.out.println("First array -> " + Arrays.toString(firstArray));
        System.out.println("Second array -> " + Arrays.toString(secondArray));
        // function call
        changeArray(firstArray);
        System.out.println("\nAfter calling the function: ");
        System.out.println("First array -> " + Arrays.toString(firstArray));
        System.out.println("Second array -> " + Arrays.toString(secondArray));
        // change everything

         System.out.println();
     }
     // pass by reference
     // not by value
     private static void changeArray(int dataArray[]){
        dataArray[0] = 366;
     }
}