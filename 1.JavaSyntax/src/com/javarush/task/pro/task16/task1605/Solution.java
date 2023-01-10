package com.javarush.task.pro.task16.task1605;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Карманный телепорт
*/

public class Solution {

    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
       while (!isTeleportInvented(currentDay)) {
           int month = currentDay.get(Calendar.YEAR);
           int a = month + 10;
          currentDay.set(Calendar.YEAR, a);

       }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишите тут ваш код
        if (INVENTION_DAY.before(currentDay))
        {
            System.out.println(INVENTED);
            return true;
        }
        else  System.out.println(NOT_INVENTED);
        return false;
    }
}