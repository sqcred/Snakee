package com.sqcred.snakee.object.game.settings;

import com.sqcred.snakee.object.game.board.Royale;
import com.sqcred.snakee.object.game.board.Squad;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Settings {

    @Getter
    private int foodSpawnChance;
    @Getter
    private int minimumFood;
    @Getter
    private int hazardDamagePerTurn;
    @Getter
    private Royale royale;
    @Getter
    private Squad squad;

}
