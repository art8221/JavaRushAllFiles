package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    //напишите тут ваш код
   public int compare (JavaRushMentor str1 , JavaRushMentor str2){
       return str1.toString().length()-str2.toString().length();
   }
}
