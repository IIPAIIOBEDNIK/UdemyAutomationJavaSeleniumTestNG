package org.example;

public class arithmeticOperations {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 4;

        int result = num1 + num2;
        int result1 = num2 - num1;
        double result2 = (num2 / num1);
        int result3 = (num2 % num1);
        int result4 = num1++;
        int result5 = ++num1;

        if(num1 == num2 && num2 <= num1) {
            System.out.print("Значения равны");
        }
        else {
            System.out.println("Значения не равны");
        }

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }

}
