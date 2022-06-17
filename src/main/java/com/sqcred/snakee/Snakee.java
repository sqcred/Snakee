package com.sqcred.snakee;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.sqcred.snakee.hander.ISnakeHandler;
import com.sqcred.snakee.hander.SnakeeHandler;
import com.sqcred.snakee.object.EndRequest;
import com.sqcred.snakee.object.Move;
import com.sqcred.snakee.object.MoveRequest;
import com.sqcred.snakee.object.StartRequest;

import spark.Request;
import spark.Response;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Snakee {

    private final Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PUBLIC).create();
    private final ISnakeHandler handler;

    public Snakee(int port){
        port(port);
        get("/", this::handle, gson::toJson);
        post("/start", this::handle, gson::toJson);
        post("/move", this::handle, gson::toJson);
        post("/end", this::handle, gson::toJson);

        this.handler = new SnakeeHandler();
    }

    public Map<String, String> handle(Request req, Response res){
        Map<String, String> response = new HashMap<>();
        String path = req.uri();

        switch (path){
            case "/":
                response.put("apiversion", Settings.API_VERSION);
                response.put("author", Settings.AUTHOR);
                response.put("color", Settings.COLOR);
                response.put("head", Settings.HEAD);
                response.put("tail", Settings.TAIL);
                response.put("version", Settings.VERSION);
                break;
            case "/start":
                StartRequest startRequest = gson.fromJson(req.body(), StartRequest.class);
                this.handler.onStart(startRequest);
                break;
            case "/move":
                MoveRequest moveRequest = gson.fromJson(req.body(), MoveRequest.class);
                Move move = this.handler.onMove(moveRequest);
                response.put("move", move.name().toLowerCase());
                if(Settings.SHOUT){
                    response.put("shout", "I am going " + move.name().toLowerCase());
                }
                break;
            case "/end":
                EndRequest endRequest = gson.fromJson(req.body(), EndRequest.class);
                this.handler.onEnd(endRequest);
                break;
            default:

        }

        return response;
    }

}
