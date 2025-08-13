package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        boolean a = s.nextBoolean();
        if (a) {
            glass = Math.ceil(glass);
            int b = (int) (glass);
            System.out.println(b);
        }
        else {
            glass = Math.floor(glass);
            int b = (int) (glass);
            System.out.println(b);
        }

    }
}