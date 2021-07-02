package com;
import java.util.Arrays;
public class arrayoperation {

    
    public static void main(String[] args){

        int firstArray[] = {1,3,4,5};
        int arr4[] = {2,3,5,5};
        System.out.println(Arrays.toString(firstArray));
        int secondArray[] = new int[4];

        //copy with loop
        for(int i = 0; i < firstArray.length; i++){
            secondArray[i] = firstArray[i];
        }
        System.out.println(Arrays.toString(secondArray));
        System.out.println("============================");

        int arr3[] = Arrays.copyOf(firstArray, 3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("============================");

        System.out.println(Arrays.mismatch(firstArray, arr4));


    }
}
