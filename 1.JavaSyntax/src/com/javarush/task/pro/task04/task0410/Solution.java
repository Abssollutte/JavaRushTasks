package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (s.hasNextInt()) {
            int a = s.nextInt();
            if (a < min1) {
                min2 = min1;
                min1 = a;
            }
            else if (a > min1 && a < min2) {
                min2 = a;
            }
        }
        System.out.println(min2);

    }
}