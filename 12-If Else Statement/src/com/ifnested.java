package com;
import java.util.Scanner;

public class ifnested {
    
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int dataA, dataB;
        // if nested
        /* go to if nested if the if is true*/
        System.out.println("Start program");

        System.out.print("Insert dataA = ");
        dataA = userInput.nextInt();
        System.out.print("Insert dataB = ");
        dataB = userInput.nextInt();

        if(dataA == 5){
            if(dataB == 10){
                System.out.println("true true");
            } else {
                System.out.println("true false");
            }
        } else if(dataB == 10){ //if dataB true
                System.out.println("false true");
            } else {
                System.out.println("false false");
        }

    }
}
