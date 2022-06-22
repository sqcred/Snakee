package com.sqcred.snakee.object;

public enum Move {

    UP,
    DOWN,
    LEFT,
    RIGHT;

    public Move getOpposite(){
        switch (this){
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case RIGHT:
                return LEFT;
            case LEFT:
                return RIGHT;
        }
        return UP;
    }

}
