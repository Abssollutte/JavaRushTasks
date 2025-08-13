package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a == b && b == c && c == a) {
            System.out.println(a + " " + b + " " + c);
            ;
        }
        else {
            if (a == b) {
                System.out.println(a + " " + b);
            }
            if (b == c) {
                System.out.println(b + " " + c);
            }
            if (c == a) {
                System.out.println(c + " " + a);
            }
        }

    }
}
