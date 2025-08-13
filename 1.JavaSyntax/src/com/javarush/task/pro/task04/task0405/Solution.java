package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int n = 0;
        while (n < 10) {
            int m = 0;
            while (m < 19) {
                if (m > 0 && n > 0 && n < 9) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("Б");
                }
                m++;
            }
            System.out.println("Б");
            n++;
        }

    }
}