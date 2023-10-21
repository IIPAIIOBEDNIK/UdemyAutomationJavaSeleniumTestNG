package org.example;
import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); //hasNextInt - проверка что ввели именно число

        System.out.println(number);


    }
}
