package com.javarush.task.pro.test.test1;



/*
Многосерийный предприниматель
*/

public class Building {
    private String type;

    public Building(String type) {
        this.type = type;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Building building = new Building("Ресторан");
        //building.initialize("Барбершоп");
    }
}
