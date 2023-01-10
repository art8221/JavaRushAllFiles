package com.javarush.task.pro.task18.task1819;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
        /*for (int i = 0; i<list.size();i++){
            Optional <String> str = Optional.ofNullable(list.get(i));
            System.out.println(str.orElse(text));
        }*/


       // list.stream().forEach( (s) -> System.out.println(Optional.ofNullable(s)) );
        list.stream()
                .map(value -> Optional.ofNullable(value).orElse(text))
                .forEach(System.out::println);

    }
}
