package com;

import java.util.Scanner;

public class funcrec {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.print("input number: "); // request input
        int value = userInput.nextInt(); //get the input
        System.out.println("Input your number= " + value); // output

        printValue(value);
        //int sum = sumScore(value);
        System.out.println("sum= " + sumScore(value));
    }

    private static int sumScore(int parameter){

        System.out.println("parameter= " + parameter);

        if(parameter == 0){
            return parameter;
        }
        return parameter + sumScore(parameter - 1);


    }

    // function recursive
    // runs like loop but in form of function

    private static void printValue(int parameter){
        System.out.println("score: " + parameter);

        if(parameter == 0){
            //break cannot be used outside of a loop or a switch
            return;
        }

        parameter--;

        printValue(parameter);
    }
}
