package com.kodilla.tictactoe_kodilla;

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
            Coordinates move = input.getMove();
            if (board.isEmpty(move.getRow(), move.getColumn())) {
                board.setChar(move.getRow(), move.getColumn(), getMark());
                return;
            } else {
                output.promptPositionNotAvailable();
                counter++;
            }
        } while (counter < 4);
        throw new
                OutOfAttemptsException();
    }
}