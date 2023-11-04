package org.example;

public class Arrays {
    public static void main(String[] args) {
        //int[] nums = {1, 1, 1, 2, 2, 2};
        ///////////////[0][1][2][3][4][5]
        int[] nums = new int[6];

        for (int i = 0; i < 6; i++){
            nums[i] = i;
        }

        nums[3] = 100;
/*
        for (int i = 0; i < 6; i++){
            System.out.println("Элемент [" + i + "]" + " = " + nums[i]);
        }
*/
        for (int e : nums) {
            System.out.println(e);
        }
        // Многомерные массивы

        int table[][] = new int[3][];
        table[0] = new int [5];
        table[1] = new int [50];
        table[2] = new int [25];









    }
}
