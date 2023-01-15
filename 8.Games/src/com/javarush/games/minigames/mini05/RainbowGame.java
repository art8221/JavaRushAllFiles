package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 7; y++) {
                setCellColor(x, y, colors[y]);
            }
        }
    }
//    @Override МОЕ РЕШЕНИЕ НО БОЛЕЕ ГРОМОЗДКОЕ
//    public void initialize() {
//        setScreenSize(10, 7);
//        for (int i =0; i<10; i++){
//            setCellColor(i, 0, Color.RED);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 1, Color.ORANGE);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 2, Color.YELLOW);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 3, Color.GREEN);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 4, Color.BLUE);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 5, Color.INDIGO);
//        }
//        for (int i =0; i<10; i++){
//            setCellColor(i, 6, Color.VIOLET);
//        }

//    }

}
