package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int a = 0; a < result.length; a++) {
            result[a] = new int[a + 1];
            for (int b = 0; b < result[a].length; b++) {
                result[a][b] = a + b;
                System.out.print(a + b + " ");
            }
            System.out.println();
        }


    }
}
