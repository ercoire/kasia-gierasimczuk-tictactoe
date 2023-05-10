package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class Player {

    private char mark;
    private UserInput input;
    private UserOutput output;

    public Player(char mark) {
        this.mark = mark;
        this.output = new UserOutput();
        this.input = new UserInput(new Scanner(System.in), output);

    }

    public char getMark() {
        return mark;
    }

    public void move(Board board) {
        // player chooses position
        //check if available
        while (true) {
            Coordinates move = input.getMove();
            if (board.isEmpty(move.getRow(), move.getColumn())) {
                // mark added to board
                board.setChar(move.getRow(), move.getColumn(), mark);
                return;
            } else {
                output.promptPositionNotAvailable();
            }
        }
    }


}
