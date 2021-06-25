package com;

public class index {

    public static void main(String[] args) {
        
        // unary = operations peformed on variable

        // unary + and -
        int num = 1;
        System.out.printf("unary '+', %d become %d\n",num, +num);
        System.out.printf("unary '-', %d become %d\n",num, -num);

        // unary decrement and increment
        int num2 = 10;
        num2++;
        System.out.println("The value with '++' become = " + num2);

        int num3 = 10;
        num3--;
        System.out.println("The value with '--' become = " + num3);

        int a = 5;
        System.out.printf("The value with '++' prefix become = %d\n", ++a); // execution before display
        int b = 5;
        System.out.printf("The value from postfix become = %d \n", b++); // still same because execution after display
        System.out.println("b (postfix) now: " + b);

        // unary boolean with ! for negation

        boolean book = true;
        System.out.println("The value of boolean = " + book);
        System.out.println("The value of boolean with ! = " + !book);
    }
    
}
