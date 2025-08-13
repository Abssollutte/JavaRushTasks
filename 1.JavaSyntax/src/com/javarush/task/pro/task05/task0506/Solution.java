package com.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
//        int min = array[0];
//        for (int i = 0; i < number; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
        Arrays.sort(array);
        System.out.println(array[0]);


    }
}
