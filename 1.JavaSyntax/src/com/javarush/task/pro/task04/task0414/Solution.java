package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        int i = 0;
        do {
            System.out.println(a);
            i++;
        }
        while (i<b && b < 5);


    }
}