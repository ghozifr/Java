package com;
import java.util.Scanner;

public class basic1{

    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("Binary number is: ");
        for(j = i - 1; j > 0; j--){
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }

        /* MULTIPLY TWO BINARY NUMBERS
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        while (binary2 != 0) {
            digit = (int)(binary2 % 10);
            if(digit == 1){
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            }
            else{
                binary1 = binary1 * factor;
            }
            binary2 = binary2 = binary2 / 10;
            factor = 10;
            }
            System.out.print("Product of two binary numbers: " + multiply + "\n");
        }

        private static int binaryproduct(int binary1, int binary2){
            int i = 0, remainder = 0;
            int[] sum = new int[20];
            int binary_prod_result = 0;

            while(binary1 != 0 || binary2 != 0){
                sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
                remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
                binary1 = binary1 / 10;
                binary2 = binary2 / 10;
            }
            if(remainder != 0){
                sum[i++] = remainder;
            }
            --i;
            while(i >= 0){
                binary_prod_result = binary_prod_result * 10 + sum[i--];
            }
            return binary_prod_result;
        }*/
    

        /* ADD TWO BINARY NUMBERS
        long binary1, binary2;
        int i = 0;
        int remainder = 0;
        int sum[] = new int[20];
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = userInput.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = userInput.nextLong();

        while (binary1 != 0 || binary2 != 0){
            
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;

        }
        if(remainder != 0){
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
        
    }*/
}