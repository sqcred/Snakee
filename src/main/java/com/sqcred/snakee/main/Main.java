package com.sqcred.snakee.main;

import com.sqcred.snakee.Settings;
import com.sqcred.snakee.Snakee;

public class Main {

    public static void main(String[] args) {
        int port = Settings.PORT;
        if(args.length == 1){
            try {
                int newPort = Integer.parseInt(args[0]);
                port = newPort;
            } catch (NumberFormatException e){
                System.out.println("Invalid port specified!");
                System.exit(0);
            }
        }
        new Snakee(port);
    }

}
