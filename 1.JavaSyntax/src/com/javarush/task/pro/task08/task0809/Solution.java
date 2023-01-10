package com.javarush.task.pro.task08.task0809;

/* 
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишите тут ваш код
        for (int a = 1; a<11;a++){

            System.out.println(a);
            if (a==10) break;
            Thread.sleep(1,300000);
        }
    }
}
