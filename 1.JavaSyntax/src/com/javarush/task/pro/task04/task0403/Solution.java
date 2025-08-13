package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int sum = 0;
        boolean is = false;
        while (!is == true) {
            String a = s.nextLine();
            if (a.equalsIgnoreCase("Enter")) {
                System.out.println(sum);
                is = true;
            }
            else {
                sum += Integer.parseInt(a);


            }
        }

    }
}