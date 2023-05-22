package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class TicTacToeKodillaApplication {

// creates setup for a particular game

    public static void main(String[] args) {

        UserOutput output = new UserOutput();
        UserInput input = new UserInput(new Scanner(System.in), output);
        output.askForBoardSize();
        try {
            int size = input.selectBoardSize();
            Board board = new Board(size);
            Game game = new Game(output, input, new ComputerInput(), new BoardRowFormatter(), board);

            game.play();
        } catch (OutOfAttemptsException e) {
            output.promptTooManyAttempts();
        }

    }


}
