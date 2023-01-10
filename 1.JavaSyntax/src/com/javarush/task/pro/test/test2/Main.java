package com.javarush.task.pro.test.test2;


public class Main
    {
        public static void main(String[] args)
        {

            ChildClass obj = new ChildClass();  //Создаем объект типа com.javarush.task.pro.test.test2.ChildClass
        }

        public static String print(String text)
        {
            System.out.println(text);       //Этот метод пишет в консоль переданный текст и возвращает его же
            return text;
        }
    }

    class ParentClass                      // Объявляем com.javarush.task.pro.test.test2.ParentClass
    {
        public String a = Main.print("com.javarush.task.pro.test.test2.ParentClass.a");     //Пишем текст и им же инициализируем переменные
        public String b = Main.print("com.javarush.task.pro.test.test2.ParentClass.b");

        public ParentClass()
        {
            Main.print("com.javarush.task.pro.test.test2.ParentClass.constructor");  //Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
        }
    }

    class ChildClass extends ParentClass        //Объявляем com.javarush.task.pro.test.test2.ChildClass
    {
        public String c = Main.print("com.javarush.task.pro.test.test2.ChildClass.c");       //Пишем текст и им же инициализируем переменные
        public String d = Main.print("com.javarush.task.pro.test.test2.ChildClass.d");

        public ChildClass()
        {
            Main.print("com.javarush.task.pro.test.test2.ChildClass.constructor");//Пишем в консоль сообщение о вызове конструктора. Возвращаемое значение игнорируем.
        }
    }