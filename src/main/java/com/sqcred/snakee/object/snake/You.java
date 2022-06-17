package com.sqcred.snakee.object.snake;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
public class You {

    @Getter
    private String id;
    @Getter
    private String name;
    @Getter
    private int health;
    @Getter
    private ArrayList<Body> body;
    @Getter
    private String latency;
    @Getter
    private Head head;
    @Getter
    private int length;
    @Getter
    private String shout;
    @Getter
    private String squad;
    @Getter
    private Customizations customizations;

}
