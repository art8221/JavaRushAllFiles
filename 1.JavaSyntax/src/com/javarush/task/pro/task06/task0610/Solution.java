package com.javarush.task.pro.task06.task0610;

/* 
Борьба за доступ
*/

public class Solution {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "Иванов");
        Person person2 = new Person("Артем", "Мильченко");//от меня
        System.out.println("Досье.");
        System.out.println("Имя: " + person1.getFirstName());
        System.out.println("Фамилия: " + person1.getLastName());
        System.out.println("Полное имя: " + person1.getFullName());
        System.out.println("И другой чувак: " + person2.getFullName());//от меня
    }
}
