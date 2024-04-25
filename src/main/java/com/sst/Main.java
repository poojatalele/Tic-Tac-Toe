package com.sst;

import com.sst.controllers.GameController;
import com.sst.exceptions.InvalidMoveException;
import com.sst.models.*;

import java.util.List;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {

        System.out.println("Hello world!");
//        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();

//        System.out.println("Please input the game dimension: ");
        int dimension = 3;
        List<Player> players = List.of(
                new Player("Pooja", new Symbol('X'), PlayerType.HUMAN),
                new Bot("Scaler", new Symbol('0'),PlayerType.BOT, BotDifficultyLevel.EASY)
        );
        Game game = new Game(dimension, players);

        while(game.getGameState().equals(GameState.IN_PROGRESS)){
            // 1. print the board
            gameController.printBoard(game);

            //2. Player's turn
            gameController.makeMove(game);
        }
        if (!gameController.checkState(game).equals(GameState.ENDED)) {
            game.setGameState(GameState.DRAW);
            System.out.println("Game DRAW");
        } else {
            gameController.printBoard(game);
            System.out.println("Player " + gameController.getWinner(game).getName() + " is the winner");
        }
    }
}