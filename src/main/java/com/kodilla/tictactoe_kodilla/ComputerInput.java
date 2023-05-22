package com.kodilla.tictactoe_kodilla;


import java.util.ArrayList;
import java.util.Random;

public class ComputerInput {

    private final Random random = new Random();


    public Coordinates computerPicksPosition(Board board) {
        ArrayList<Coordinates> positions = board.getPositionsTaken();
        Coordinates computersPick;
        do {
            computersPick = new Coordinates(random.nextInt(board.getSize()), random.nextInt(board.getSize()));
        }
        while (positions.contains(computersPick));
        positions.add(computersPick);
        return computersPick;
    }


}
