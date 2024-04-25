package com.sst.models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Symbol sym, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, sym, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
