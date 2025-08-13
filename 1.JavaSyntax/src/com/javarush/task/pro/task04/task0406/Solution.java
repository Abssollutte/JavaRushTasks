package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);

        while (true) {
            String a = s.nextLine();
            if (a.equalsIgnoreCase("enough")) {
                break;
            }
            else {
                System.out.println(a);
            }
        }

    }
}