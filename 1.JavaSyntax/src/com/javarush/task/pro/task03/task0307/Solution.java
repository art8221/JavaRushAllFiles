package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner old = new Scanner (System.in);
        int a = old.nextInt ();
        boolean isOld = (a <20 || a > 60);
        if (isOld)
            System.out.println("можно не работать");
    }
}
