package com.sqcred.snakee.object.game.board;

import com.sqcred.snakee.object.snake.Snake;
import com.sqcred.snakee.object.game.Food;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
public class Board {

    @Getter
    private int height;
    @Getter
    private int width;
    @Getter
    private ArrayList<Food> food;
    @Getter
    private ArrayList<Hazard> hazards;
    @Getter
    private ArrayList<Snake> snakes;

}
