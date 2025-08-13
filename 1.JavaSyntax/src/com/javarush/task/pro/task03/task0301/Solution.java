package com.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло или холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a >= 0) {
            System.out.println(warm);
        }
        else {
            System.out.println(cold);
        }
    }
}
