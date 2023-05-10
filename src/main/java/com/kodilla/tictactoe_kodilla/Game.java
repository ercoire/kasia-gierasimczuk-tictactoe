package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class Game {
    // to keep moves in order
    private final ResultVerifier verifier;
    private final Board board;
    private final UserInput input;
    private final UserOutput output;

    public Game() {
        this.verifier = new ResultVerifier();
        this.board = new Board();
        this.output = new UserOutput();
        this.input = new UserInput(new Scanner(System.in), output);

    }

    public void play() {
        //keeps the whole game running

        //welcome message & printing the board with positions
        output.askForChar();
        //choosing character
        char mark1 = input.selectCharacter();
        Player player1 = new Player(mark1);
        Player player2 = new Player(determinePlayer2Char(mark1));
        output.firstPrintBoard();
        //making a move
        while (true) {
            output.askForNextMove(player1.getMark());
            player1.move(board);
            //printing the board
            output.printBoard(board);
            //declaring a winner/a draw/next move
            if (isGameOver()) {
                return;
            }
            output.askForNextMove(player2.getMark());
            player2.move(board);
            output.printBoard(board);
            if (isGameOver()) {
                return;
            }
        }
    }

    private boolean isGameOver() {
        int result = verifier.getResult(board);
        if (result > 0) {
            if (result == 1) {
                output.declareWinner('X');

            } else if (result == 2) {
                output.declareWinner('O');

            } else if (result == 3) {
                output.declareDraw();

            }
            return true;
        }
        return false;
    }


    private static char determinePlayer2Char(char mark1) {
        if (mark1 == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

}

