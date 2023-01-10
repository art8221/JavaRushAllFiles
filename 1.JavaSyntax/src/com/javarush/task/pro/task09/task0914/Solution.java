package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код

        int index = path.indexOf("/");
        int index2 = path.indexOf("/", index + 1);
        int index3 = path.indexOf("/", index2 + 1);
        int index4 = path.indexOf("/", index3 + 1);

        String first = path.substring(0, index3 + 1);
        String last = path.substring(index4);

        path = first + jdk + last;

        return path;

    }
}
