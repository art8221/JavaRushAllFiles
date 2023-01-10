package com.javarush.task.pro.task16.task1612;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/* 
Синтезируем LocalDateTime
*/

public class Solution {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        Map<LocalDate, List<LocalTime>> map= sourceMap;
        HashSet<LocalDateTime> set = new HashSet<>();
            for (LocalDate key: map.keySet())
            {
                List<LocalTime>time= map.get(key);
                for (int b = 0; b< time.size();b++) {

                    set.add(LocalDateTime.of(key, (time.get(b))));
                }
            }




        return set;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}