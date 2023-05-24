package com.kodilla.tictactoe_kodilla;


import java.util.ArrayList;
import java.util.Random;

public class ComputerInput {

    private final Random random;

    public ComputerInput(Random random) {
        this.random = random;
    }

    public Coordinates computerPicksPosition(Board board) {
        ArrayList<Coordinates> availablePositions = board.getPositionsEmpty();
        int index = random.nextInt(availablePositions.size());
        return availablePositions.remove(index);
    }


}
