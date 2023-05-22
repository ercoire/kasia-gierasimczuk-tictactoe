package com.kodilla.tictactoe_kodilla;

import static com.kodilla.tictactoe_kodilla.Character.O;
import static com.kodilla.tictactoe_kodilla.Character.X;


public class Game {

    private final UserInput input;
    private final ComputerInput computerInput;
    private final UserOutput output;
    private final BoardRowFormatter formatter;
    private final Board board;


    public Game(UserOutput output, UserInput input, ComputerInput computerInput, BoardRowFormatter formatter, Board board) {
        // to keep moves in order
        this.board = board;
        this.output = output;
        this.input = input;
        this.computerInput = computerInput;
        this.formatter = formatter;


    }

    public void play() {
        //keeps the whole game running

        try {
            Character mark1 = input.selectCharacter();
            Player player1 = new Player(mark1, input, output);
            Player player2 = new Player(determinePlayer2Char(mark1), input, output);
            output.firstPrintBoard(board.getSize());

            //making a move
            executeTurnAgainstComputer(board, player1, player2);
        } catch (OutOfAttemptsException e) {
            output.promptTooManyAttempts();
        }
    }


    private void executeTurnAgainstComputer(Board board, Player player1, Player player2) throws OutOfAttemptsException {
        do {
            output.askForNextMove(player1.getMark());
            player1.move(board);
            output.printBoard(board, formatter);
            //declaring a winner/a draw/next move
            if (isGameOver()) {
                return;
            }
            output.promptComputersMove();
            player2.randomMove(board, computerInput);
            output.printBoard(board, formatter);

        }
        while (!isGameOver());
    }


    private boolean isGameOver() {
        Result result = ResultVerifier.getResult(board);
        if (!result.equals(Result.GAME_CONTINUES)) {
            if (result.equals(Result.X_WINS)) {
                output.declareWinner(Character.X);

            } else if (result.equals(Result.O_WINS)) {
                output.declareWinner(Character.O);

            } else if (result.equals(Result.DRAW)) {
                output.declareDraw();
            }
            return true;
        }
        return false;
    }


    private static Character determinePlayer2Char(Character mark1) throws OutOfAttemptsException {
        if (mark1 == null) {
            throw new OutOfAttemptsException();
        }
        if (mark1.equals(X)) {
            return O;
        } else if (mark1.equals(O)) {
            return X;
        }
        return null;
    }
}

