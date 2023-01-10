package com.javarush.task.pro.task16.task1610;

import java.time.LocalTime;

/* 
Тренировка на время
*/

public class Solution {

    static LocalTime timeMax=LocalTime.of(23, 59, 59,999999999);;
    static LocalTime timeMin= LocalTime.of(0, 0, 0);;
    static LocalTime time1=LocalTime.of(14, 0, 0);;
    static LocalTime time2 =LocalTime.of(7, 0, 8);;
    static LocalTime time3= LocalTime.of(0, 45, 0,61);
    static LocalTime time4= LocalTime.of(14, 0, 45,1001);

    public static void main(String[] args) {
        //напишите тут ваш код
        int hours =time1.getHour();
        int minute = time2.getMinute();
        int second = time3.getSecond();
        int nanoSecond = time4.getNano();
        LocalTime localTime=LocalTime.of(hours, minute, second,nanoSecond);
        System.out.println(localTime);
    }
}
