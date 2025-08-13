package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a < min) {
                min = a;
            }

        }
        System.out.println(min);

    }
}