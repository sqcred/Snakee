package com.sqcred.snakee.object;

import com.sqcred.snakee.object.game.board.Board;
import com.sqcred.snakee.object.game.Game;
import com.sqcred.snakee.object.snake.You;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MoveRequest {

    @Getter
    private Game game;
    @Getter
    private int turn;
    @Getter
    private Board board;
    @Getter
    private You you;

}
