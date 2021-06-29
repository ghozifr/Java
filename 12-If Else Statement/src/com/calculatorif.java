package com;
import java.util.*;
public class calculatorif {

    public static void main(String[] args) {
        
        Scanner inputUser;
        float a, b, result;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Value of a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Value of b = ");
        b = inputUser.nextFloat();
        System.out.println();

        System.out.println(a + "  " + operator + "  " + b);

        if(operator == '+'){
            result = a + b;
            System.out.println("Result: " + result);
        } else if(operator == '-'){
            result = a - b;
            System.out.println("Result: " + result);
        } else if(operator == 'x'){
            result = a * b;
            System.out.println("Result: " + result);
        } else if(operator == '/'){
            if(b == 0){
                System.out.println(" 0 will cause infinity");
            } else{
                result = a / b;
                System.out.println("Result: " + result);
            }
        } else{
            System.out.println(operator + "not found");
        }
    }
}
