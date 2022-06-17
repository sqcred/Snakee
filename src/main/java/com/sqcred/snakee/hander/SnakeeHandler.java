package com.sqcred.snakee.hander;

import com.sqcred.snakee.object.EndRequest;
import com.sqcred.snakee.object.Move;
import com.sqcred.snakee.object.MoveRequest;
import com.sqcred.snakee.object.StartRequest;

import org.tinylog.Logger;

public class SnakeeHandler implements ISnakeHandler {

    @Override
    public Move onMove(MoveRequest request) {
        Logger.info(request.getYou().getLatency());
        return Move.UP;
    }

    @Override
    public void onStart(StartRequest request) {

    }

    @Override
    public void onEnd(EndRequest request) {

    }

}
