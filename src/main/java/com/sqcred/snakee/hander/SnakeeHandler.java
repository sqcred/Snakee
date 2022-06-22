package com.sqcred.snakee.hander;

import com.sqcred.snakee.object.EndRequest;
import com.sqcred.snakee.object.Move;
import com.sqcred.snakee.object.MoveRequest;
import com.sqcred.snakee.object.StartRequest;
import com.sqcred.snakee.object.game.Food;
import com.sqcred.snakee.utils.MathUtils;

public class SnakeeHandler implements ISnakeHandler {

    @Override
    public Move onMove(MoveRequest request) {
        return calculateMove(request);
    }

    @Override
    public void onStart(StartRequest request) {

    }

    @Override
    public void onEnd(EndRequest request) {

    }

    private Move calculateMove(MoveRequest request){
        Food nearestFood = MathUtils.getNearestFood(request.getYou(), request.getBoard().getFood());
        int foodX = nearestFood.getX();
        int foodY = nearestFood.getY();

        int snakeX = request.getYou().getHead().getX();
        int snakeY = request.getYou().getHead().getY();

        Move move = Move.UP;

        if(snakeX != foodX){
            if(snakeX > foodX){
                move = Move.LEFT;
            } else {
                move = Move.RIGHT;
            }
        }

        if(snakeY != foodY){
            if(snakeY > foodY){
                move = Move.DOWN;
            } else {
                move = Move.UP;
            }
        }

        return move;
    }

}
