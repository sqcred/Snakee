package com.sqcred.snakee.object.game.board;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Squad {

    @Getter
    private boolean allowBodyCollisions;
    @Getter
    private boolean sharedElimination;
    @Getter
    private boolean sharedHealth;
    @Getter
    private boolean sharedLength;

}
