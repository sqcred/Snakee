package com.sqcred.snakee.object.game;

import com.sqcred.snakee.object.game.settings.Ruleset;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Game {

    @Getter
    private String id;
    @Getter
    private Ruleset ruleset;
    @Getter
    private String map;
    @Getter
    private String source;
    @Getter
    private int timeout;

}
