package org.example;

import java.io.IOException;

public class Cycles {
    public static void main(String[] args) throws IOException {
        /*
        for (int count = 0; count < 7; count++) {
            System.out.println("Итерация " + count);
        }

        System.out.println("Введите слово");
        for (int count = 0; (char) System.in.read() != 'r'; count++){
            System.out.println("Итерация " + count);
        }
*/
    int i = 0;
    /*
        while(i < 10){
            System.out.println(i);
            i++;

            if(i == 5) break;
        }
         */

        while(i < 10){
            i++;
            if(i%2 != 0) continue;
            System.out.println(i);


        }

/*
        do {
            System.out.println(i);
            i++;
        } while(i<10);
*/
    }
}
