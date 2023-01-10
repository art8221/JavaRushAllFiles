package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner a = new Scanner(System.in );
        int max = Integer.MIN_VALUE;
        while(a.hasNextInt())
        {
            int b = a.nextInt();
            if ((b%2)==0);
            max = b;
        }
        System.out.println(max);
    }
}