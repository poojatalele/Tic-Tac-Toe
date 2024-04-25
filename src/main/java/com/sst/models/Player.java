package com.sst.models;

import java.util.Scanner;

public class Player {
    private String name;
    private Symbol sym;
    private PlayerType playerType;
    private static Scanner sc = new Scanner(System.in);

    public Player(String name, Symbol sym, PlayerType playerType) {
        this.name = name;
        this.sym = sym;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSym() {
        return sym;
    }

    public void setSym(Symbol sym) {
        this.sym = sym;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }


    public Move makeMove(Board board){
        //Ask the user where they want to input the symbol
        System.out.println("Please enter the row number where you want to make a move!");
        int row = sc.nextInt();

        System.out.println("Please enter the col number where you want to make a move!");
        int col = sc.nextInt();

        return new Move(new Cell(row, col), this);
    }
}
