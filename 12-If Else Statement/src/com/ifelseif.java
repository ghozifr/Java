package com;

import java.util.Scanner; //*

public class ifelseif {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        // if else if statement

        int a;

        System.out.println("Enter the program");
        System.out.print("Insert the number = ");
        a = userInput.nextInt();

        if(a == 5){
            System.out.println("1");
        } else if (a < 5){
            System.out.println("0");
        } else {
            System.out.println(" more ");
        }

        System.out.println("End of the program");

    }
}
