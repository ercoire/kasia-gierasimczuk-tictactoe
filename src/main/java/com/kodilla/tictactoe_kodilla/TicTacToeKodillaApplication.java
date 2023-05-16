package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class TicTacToeKodillaApplication {

// to create setup for a particular game

    public static void main(String[] args) {

        Game game = new Game(
                new Board(),
                new UserOutput(),
                new UserInput(new Scanner(System.in), new UserOutput()),
                new BoardRowFormatter()
        );

        game.play();

    }


}
