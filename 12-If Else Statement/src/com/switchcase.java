package com;
import java.util.*;

    public class switchcase{

        public static void main(String[] args){

            String input;
            Scanner inputUser = new Scanner(System.in);

            System.out.print("call name: ");
            input = inputUser.next();
            System.out.println();

            //conditional expression (int, long, byte, short), String, or enum
            switch(input){
                case "gopal": //option
                System.out.println("Saye Gopal, ade disini"); //output
                System.out.println();
                break; //cut
                case "fizi":
                System.out.println("Saye Fizi, ade disini");
                System.out.println();
                break;
                default:
                System.out.println( input + " Tak ade");
            }

            System.out.println("end of program");
        }
    }