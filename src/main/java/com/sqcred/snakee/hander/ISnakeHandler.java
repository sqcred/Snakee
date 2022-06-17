package com.sqcred.snakee.hander;

import com.sqcred.snakee.object.EndRequest;
import com.sqcred.snakee.object.Move;
import com.sqcred.snakee.object.MoveRequest;
import com.sqcred.snakee.object.StartRequest;

public interface ISnakeHandler {

    Move onMove(MoveRequest request);

    void onStart(StartRequest request);
    void onEnd(EndRequest request);

}
