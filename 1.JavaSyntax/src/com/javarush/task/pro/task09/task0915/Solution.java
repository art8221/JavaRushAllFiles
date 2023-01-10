package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите сюда ваш код
            StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
            String[] result = new String[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                result[i++] = stringTokenizer.nextToken();
            }
            return result;
        //------------------------------мое решение не прокатило
/*
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] art = new String[3];
        for (int a = 0; tokenizer.hasMoreTokens(); a++) {
            art[a] = tokenizer.nextToken();
            }
        return art;


        //----------------------------------------------------------------------------
*/
    }
}
