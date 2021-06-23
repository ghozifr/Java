package com;

public class index {
    
    public static void main(String[] args){

        // Program for data coversion
        //casting operator

        int intValue = 450; // 32-bit
        System.out.println("int value = " + intValue);

        // Expand the range to a larger data type (Wideing Casting)
        long longValue = intValue;
        System.out.println("long value = " + longValue);

        //Reduce the range to a smaller data type (Narrowing Casting)
        byte byteValue = (byte) intValue;
        System.out.println("byte value = " + byteValue); // WARING if the value more than max value, it will repeat back
        System.out.println("max value of byte = " + Byte.MAX_VALUE);
        System.out.println("min value of byte = " + Byte.MIN_VALUE);

        // Casting division
        int a = 10;
        float b = 4;

        float c = a / b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float)x / y;
        System.out.printf("%d / %d = %f\n",x,y,z);
        
        System.out.println("This is float z = " + z);

        z = (int)z;
        System.out.println("This is float z after casting to int = " + z);
        System.out.println("Interesting right??");
    }
}
