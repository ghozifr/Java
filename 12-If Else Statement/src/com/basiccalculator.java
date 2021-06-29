package com;
import java.util.*;

public class basiccalculator {
    public static void main(String[] args) {
        
        Scanner inputUser;
        float a, b, result;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Value of a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Value of b = ");
        b = inputUser.nextFloat();
        System.out.println();
        System.out.println(a + "  " + operator + "  " + b);
        System.out.println();

        switch (operator) {
            case "+":
                //addition
                result = a + b;
                System.out.println("result: " + result);
                break;
            case "-":
                //subtraction
                result = a - b;
                System.out.println("result: " + result);
                break;
            case "x":
                //multiplication
                result = a * b;
                System.out.println("result: " + result);
                break;
            case "/":
                //division
                if(b == 0){
                    System.out.println(" 0 will cause infinity");
                } else{
                result = a / b;
                    System.out.println("result: " + result);
                }
                break;
        
            default:
            System.out.println("operator" + operator + "not found");
                break;
        }

    }
}
