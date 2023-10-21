package org.example;

import java.io.IOException;

public class ConditionalStatements {
    /*
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Поздравляю!");
        } else if (ch > answer) {
            System.out.println("Значение больше");
        } else{
            System.out.println("Значение меньше");
        }
    }
    */
    public static void main(String[] args) {
        int month = 3;
        String monthString;

        switch (month) {
            case 1: monthString = "Январь";
            break;
            case 2: monthString = "Февраль";
            break;
            case 3: monthString = "Март";
            break;
            case 4: monthString = "Апрель";
            break;
            case 5: monthString = "Май";
            break;
            case 6: monthString = "Июнь";
            break;
            case 7: monthString = "Июль";
            break;
            case 8: monthString = "Август";
            break;
            case 9: monthString = "Сентябрь";
            break;
            case 10: monthString = "Октябрь";
            break;
            case 11: monthString = "Ноябрь";
            break;
            case 12: monthString = "Декабрь";
            break;
            default: monthString = "Месяц не опознан";
        }
        System.out.println(monthString);
    }
}
