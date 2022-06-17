package com.sqcred.snakee.object.game.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Ruleset {

    @Getter
    private String name;
    @Getter
    private String version;
    @Getter
    private Settings settings;

}
