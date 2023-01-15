package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.awt.*;

/* 
Работа с мышью
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        //напишите тут ваш код
        setScreenSize(5, 5);
        for (int a=0; a<5; a++){
            for (int b=0; b<5; b++){
                setCellColor(a, b, Color.WHITE);
            }
        }

    }

    //напишите тут ваш код
    @Override
    public void onMouseLeftClick(int x, int y) {
                setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
                setCellColor(x, y, Color.ORANGE);
    }
}
