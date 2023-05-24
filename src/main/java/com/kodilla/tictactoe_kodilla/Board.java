package com.kodilla.tictactoe_kodilla;

import java.util.ArrayList;

import static com.kodilla.tictactoe_kodilla.Character.SPACE;

public class Board {


    private final Character[][] board;
    private final int size;
    private final ArrayList<Coordinates> positionsEmpty = new ArrayList<>();


    public Board(int size) {
        this.size = size;
        board = new Character[this.size][this.size];
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                board[i][j] = SPACE;
                positionsEmpty.add(new Coordinates(i, j));
            }
        }

    }


    public ArrayList<Coordinates> getPositionsEmpty() {
        return positionsEmpty;
    }


    public int getSize() {
        return size;
    }


    public Character getChar(int row, int column) {
        return board[row][column];
    }

    public void setChar(int row, int column, Character c) {
        board[row][column] = c;
    }

    public boolean isEmpty(int row, int column) {
        return (getChar(row, column).equals(SPACE));
    }

}
