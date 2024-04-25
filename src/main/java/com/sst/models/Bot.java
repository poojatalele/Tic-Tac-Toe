package com.sst.models;

import java.util.List;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(String name, Symbol sym, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(name, sym, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }
    @Override
    public Move makeMove(Board board){
        //find the first empty cell and make the move there
        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell, this);
                }
            }
        }
        return null;
    }
}
