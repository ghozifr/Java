package com;

public class main {
    public static void main(String[] args) {
        
        // Arithmetic Operator

        int variable1 = 10;
        int variable2 = 5;

        int result;

        // 1. Addition

        result = variable1 + variable2;
        
        System.out.println(variable1 + " + " + variable2 + " = " + result);

        // 2. Subtraction

        result = variable1 - variable2;

        System.out.printf("%d - %d = %d \n", variable1, variable2, result);

        // 3. Multiplication

        result = variable1 * variable2;

        System.out.printf("%d x %d = %d \n", variable1, variable2, result);

        // 4. Division

        result = variable1 / variable2;

        System.out.printf("%d / %d = %d \n", variable1, variable2, result);
        
        //using float
        float a = 6;
        float b = 5;
        float resultFloat = a / b;
        System.out.println(a + " / " + b + " = " + resultFloat);

        // 5. Modulus (leftovers for)

        result = variable1 % variable2;
        
        System.out.printf("%d %% %d = %d \n", variable1, variable2, result);

        resultFloat = a % b;

        System.out.printf("%f %% %f = %f \n", a, b, resultFloat);

    }
}