package com.sst.controllers;

import com.sst.exceptions.InvalidMoveException;
import com.sst.exceptions.SameSymbolException;
import com.sst.models.GameState;
import com.sst.models.Player;
import com.sst.models.Game;

import java.util.HashSet;
import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) throws SameSymbolException {
        /*
        TODO
        Validate if the 2 players have the same symbol or not
        If the 2 players have the same symbol, throw some exception
        */
        HashSet<Character> symSet = new HashSet<>();
        for(int i=0;i<players.size();i++){
            if(symSet.contains(players.get(i).getSym().getCh())){
                throw new SameSymbolException("OOPS!! Some player already selected this symbol.");
            }
        }
        return new Game(dimension, players);
    }
    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }
    public GameState checkState(Game game){
        return  game.getGameState();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void printBoard(Game game){
        game.printBoard();
    }
}
