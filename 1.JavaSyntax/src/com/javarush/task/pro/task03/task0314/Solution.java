package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(secret.equalsIgnoreCase(a) ? "доступ разрешен" : "доступ запрещен");
        //напишите тут ваш код
    }
}
