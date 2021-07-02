package com;
import java.util.*;
import java.lang.String;

public class funcrec{

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("input number n= ");
        int score = userInput.nextInt();
        int fibonacci_value = fibonacci(score, "up");
        System.out.println("fibonacci - " + score + " is " + fibonacci_value);
    }


    private static int fibonacci(int n, String leaf){
        System.out.println("leaf " + leaf);
        System.out.println("Finonacci - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else{
            return fibonacci(n - 1, "left") + fibonacci(n - 2, "right");
        }
    }
}

// 2^n
// cause computer slow (n++ = computer slow)