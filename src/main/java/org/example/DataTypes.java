package org.example;

public class DataTypes {
    public static void main(String[] args) {

        // Целые числа
        byte num = 100; //8 бит -128 : 127
        short num1 = 131; //16 бит -32768 : 32767
        int num2 = 141; // 32 бит -2147483648 : 2144743647
        long num3 = 123; // 64 бит

        // Дробные(Вещественные) числа
        float num4 = 1.1F; // 32 бит 1.123456 (6-7 знаков после точки)
        double num5 = 1.11; // 64 бит, точность после точки 15 знаков

        //Символьные
        char sym = '\u2122'; // 16 бит

        //Логический
        boolean isTrue = false; // 1 бит true/false

    }
}
