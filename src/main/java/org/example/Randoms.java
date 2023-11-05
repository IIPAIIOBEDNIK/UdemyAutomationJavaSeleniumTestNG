package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Randoms {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 100); //Генерит от 0 до 1
        System.out.println(num);

        Random random = new Random();
        int twice = random.nextInt(3);
        System.out.println(twice);


    }
}
