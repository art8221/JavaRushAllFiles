package com.javarush.task.pro.task05.task0512;
import java.util.Arrays;
/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        //напишите тут ваш код
        
            String str = Arrays.deepToString(multiArray);
            System.out.println(str);
    }
}
