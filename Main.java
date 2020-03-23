package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[])  {
        Scanner scnr = new Scanner(System.in);
        // вычисляем минимум трех чисел
        System.out.println("введите три числа");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c = scnr.nextInt();
        int min ;

        System.out.println(Math.min(a, Math.min(b, c)));
    }


}



