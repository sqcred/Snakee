package com.sqcred.snakee.utils;

import com.sqcred.snakee.object.game.Food;
import com.sqcred.snakee.object.snake.Head;
import com.sqcred.snakee.object.snake.You;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class MathUtils {

    public Food getNearestFood(You you, List<Food> foods){
        Food nearest = foods.get(0);
        int nearestDist = 100;

        Head head = you.getHead();

        for (Food food : foods) {
            int distance = (int) Math.sqrt(Math.pow(Math.abs(food.getX() - head.getX()), 2) + Math.pow(Math.abs(food.getY() - head.getY()), 2));
            if(distance <= nearestDist){
                nearest = food;
                nearestDist = distance;
            }
        }

        return nearest;
    }

}
