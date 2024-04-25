package com.sst.models;

public class Player {
    private String name;
    private Symbol sym;
    private PlayerType playerType;

    public Player(String name, Symbol sym, PlayerType playerType) {
        this.name = name;
        this.sym = sym;
        this.playerType = playerType;
    }
}
