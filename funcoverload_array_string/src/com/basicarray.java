package com;
import java.util.Arrays;

public class basicarray {
    
    public static void main(String[] args) {

        System.out.println("Assignment Array");
        
        int[] arrayint = {2,3,4,5};

        arrayint[2] = 14;

        System.out.println(arrayint[0]);
        System.out.println(arrayint[1]);
        System.out.println(arrayint[2]);
        System.out.println(arrayint[3]);

        System.out.println("Declaration Array");
        float[] arrayfloat = new float[4];

        arrayfloat[1] = 15.2f;

        System.out.println(arrayfloat[0]);
        System.out.println(arrayfloat[1]);
        System.out.println(arrayfloat[2]);
        System.out.println(arrayfloat[3]);

        System.out.println(Arrays.toString(arrayint));
        System.out.println(Arrays.toString(arrayfloat));
    }

}
