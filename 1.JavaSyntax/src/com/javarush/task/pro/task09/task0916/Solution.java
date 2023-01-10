package com.javarush.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут %s. Я буду зарабатывать $%d в месяц.";
        //напишите тут ваш код https://javarush.com.ua/quests/lectures/questsyntaxpro.level09.lecture05
        //Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.

        return String.format(phrase,name,salary);
        //return String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary); мое не прокатило
    }
}
