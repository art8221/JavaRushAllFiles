package com.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Считаем клетки
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        //напишите тут ваш код
        int sum = 0;
        int sumGreenCell = 0;
        for (int j = 0; j < 10; j++) {
            for (int w = 0; w < 10; w++){
                //if (getCellColor(j, w).equals(Color.GREEN)){ моя строка прошла тоже
                if ( getCellColor(j, w)==Color.GREEN ){
                    sum=sum+getCellNumber(j, w);
                    sumGreenCell++ ;
                }
            }

        }


        printSum(sum);
        printCountOfGreenCells(sumGreenCell);
    }

    private void printSum(int sum) {
        System.out.println("Сумма всех чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Количество зеленых клеток = " + count);
    }
}
