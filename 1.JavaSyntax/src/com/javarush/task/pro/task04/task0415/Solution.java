package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int radius = s.nextInt();
        int a = (int) (radius * radius * 3.14);
        System.out.println(a);

    }
}