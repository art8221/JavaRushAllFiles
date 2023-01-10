package com.javarush.task.pro.task11.task1128;

/* 
Текстовые цифры
*/

public class Solution {

    public static void main(String[] args) {
        String numberStr = "147852369";
        for (char symbol : numberStr.toCharArray()) {
            System.out.print(digitToText(symbol));
            System.out.print(" ");
        }
        System.out.println();
    }

    public static String digitToText(char digit) {
        String result = "";
        switch (digit) {
            case '0':
                result = "ноль";
                return result;
            case '1':
                result = "один";
                return result;
            case '2':
                result = "два";
                return result;
            case '3':
                result = "три";
                return result;
            case '4':
                result = "четыре";
                return result;
            case '5':
                result = "пять";
                return result;
            case '6':
                result = "шесть";
                return result;
            case '7':
                result = "семь";
                return result;
            case '8':
                result = "восемь";
                return result;
            case '9':
                result = "девять";
                return result;
        }
        return result;
    }
}
