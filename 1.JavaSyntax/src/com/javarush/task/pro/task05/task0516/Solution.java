package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код

        int a = array.length;
        int l = (array.length / 2) + (array.length % 2);

        Arrays.fill(array, 0, l, valueStart);
        Arrays.fill(array, l, a, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
