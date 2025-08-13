package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int max = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a > max && a % 2 == 0) {
                max = a;
            }
        }
        System.out.println(max);


    }
}