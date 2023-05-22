package com.kodilla.tictactoe_kodilla;

import java.util.ArrayList;

public class Player {

    private final Character mark;
    private final UserInput input;
    private final UserOutput output;

    public Player(Character mark, UserInput input, UserOutput output) {
        this.mark = mark;
        this.output = output;
        this.input = input;
    }

    public Character getMark() {
        return mark;
    }


    public void move(Board board) throws OutOfAttemptsException {
        int counter = 0;
        do {
            Coordinates move = input.getMove(board.getSize());
            if (board.isEmpty(move.getRow(), move.getColumn())) {
                board.setChar(move.getRow(), move.getColumn(), getMark());
                board.getPositionsTaken().add(move);
                return;
            } else {
                output.promptPositionNotAvailable();
                counter++;
            }
        } while (counter < 4);
        throw new
                OutOfAttemptsException();
    }

    public void randomMove(Board board, ComputerInput computerInput) {
        do {
            Coordinates randomMove = computerInput.computerPicksPosition(board);
            if (board.isEmpty(randomMove.getRow(), randomMove.getColumn())) {
                board.setChar(randomMove.getRow(), randomMove.getColumn(), getMark());
                return;
            }
        } while (true);

    }
}