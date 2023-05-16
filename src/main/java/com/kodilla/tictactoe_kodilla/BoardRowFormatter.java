package com.kodilla.tictactoe_kodilla;

public class BoardRowFormatter {

    public String formatRow(int row, Board board){
        return (" " + board.getChar(row,0).getName() + " " + "| " + board.getChar(row,1).getName() + " | " + board.getChar(row, 2).getName());
    }
}
