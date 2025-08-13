package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        System.out.println(a.equals(b) ? "строки одинаковые" : "строки разные");
        //напишите тут ваш код

    }
}
