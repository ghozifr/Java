package com;
import java.util.*;

public class ternaryoperator {
    
    public static void main(String[] args){

        // ternary operator
        // more simple than if

        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("enter the value: ");
        input = inputUser.nextInt();

        // variable x = expression ? statement_true ; statement_false
        // linguistically if
        x = (input == 10) ? (input * input) : (input / 2);

        System.out.println("result: " + x);
    }
}
