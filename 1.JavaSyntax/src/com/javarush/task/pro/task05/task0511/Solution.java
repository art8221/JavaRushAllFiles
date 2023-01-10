package com.javarush.task.pro.task05.task0511;

import java.util.Arrays;
import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner a = new Scanner(System.in);
        int c = a.nextInt();
        multiArray = new int[c][];
        for (int b = 0; b < multiArray.length; b++) {
            Scanner w = new Scanner(System.in);
            int e = w.nextInt();
            multiArray[b] = new int[e];
            for (int d = 0; d < multiArray[b].length; d++) {

                multiArray[b][d] = b + d;
                int[][][] array = { {{1, 2, 3}, {1}}, {{}} };
                String str = Arrays.deepToString(array);

            }

        }

    }
}




