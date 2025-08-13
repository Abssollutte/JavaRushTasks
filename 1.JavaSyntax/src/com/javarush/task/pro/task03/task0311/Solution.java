package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        if ( Math.abs(b - a) < 0.000001 )
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}
