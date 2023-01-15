package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    //напишите тут ваш код
    @Override
    public void onTurn(int step) {
        setCellNumber(1, 1, step);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, step % 2 == 0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }

//    @Override//МОЙ КОД
//    public void onTurn(int step) {
//        setCellNumber(1, 1, step);
//        if (step%2==0){
//            for (int a=0; a<3; a++) {
//                for (int b=0; b<3; b++) {
//                    setCellColor(a, b, Color.GREEN);
//                }
//            }
//        }
//        else {
//            for (int a=0; a<3; a++) {
//                for (int b=0; b<3; b++) {
//                    setCellColor(a, b, Color.ORANGE);
//                }
//            }
//        }
//    }
}
