package com;

public class index{

    public static void main(String[] args){

        int a = 0;
        boolean condition = true;

        System.out.println("Start the program");
        System.out.println();

        while(condition){
            System.out.println("while loop - " + a);

            if(a == 10){
                condition = false;
            }
            a++;
        }

        System.out.println("End of the program");

    }
}