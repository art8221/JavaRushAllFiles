package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student>{
    //напишите тут ваш код
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getAge() - student1.getAge();
    }
    //Мой рабочий
    /*public int compare (Student obj1, Student obj2){

    if ((obj1.getAge()>obj2.getAge())) {
        return -1;
    }else if ((obj1.getAge()<obj2.getAge())){
        return 1;
    }
    return 0;
    }*/


}
