package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        long c = 3;
System.out.println(cube(c));

    }

    //напишите тут ваш код
    public static long cube(long a) {

        long b= a*a*a;
        return b ;
    }
}


/* Java Rush решение

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long a){
        return a*a*a;
    }

}
 */