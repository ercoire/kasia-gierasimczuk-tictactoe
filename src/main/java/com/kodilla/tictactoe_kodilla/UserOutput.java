package com.kodilla.tictactoe_kodilla;

public class UserOutput {

    public void firstPrintBoard(int size) {
        System.out.println("Here is your board with positions where you can put your mark:");
        if (size == 3) {
            printPosition3x3();
        } else if (size == 10) printPosition10x10();
    }

    public void printBoard(Board board, BoardRowFormatter formatter) {
        int size = board.getSize();
       for (int i = 0; i < size; i++) {
            System.out.println(formatter.formatRow(i, board));
        }
    }

    public void askForBoardSize() {
        System.out.println("Choose board size - 3x3 or 10x10. Type 3 or 10.");
    }

    public void printPosition3x3() {
        System.out.println(" 00 " + "|" + " 01 " + "|" + " 02 ");
        System.out.println(" 10 " + "|" + " 11 " + "|" + " 12 ");
        System.out.println(" 20 " + "|" + " 21 " + "|" + " 22 ");
    }

    public void printPosition10x10() {
        System.out.println(" 00 " + "|" + " 01 " + "|" + " 02 " + "|" + " 03 " + "|" + " 04 " + "|" + " 05 " + "|" + " 06 " + "|" + " 07 " + "|" + " 08 " + "|" + " 09 ");
        System.out.println(" 10 " + "|" + " 11 " + "|" + " 12 " + "|" + " 13 " + "|" + " 14 " + "|" + " 15 " + "|" + " 16 " + "|" + " 17 " + "|" + " 18 " + "|" + " 19 ");
        System.out.println(" 20 " + "|" + " 21 " + "|" + " 22 " + "|" + " 23 " + "|" + " 24 " + "|" + " 25 " + "|" + " 26 " + "|" + " 27 " + "|" + " 28 " + "|" + " 29 ");
        System.out.println(" 30 " + "|" + " 31 " + "|" + " 32 " + "|" + " 33 " + "|" + " 34 " + "|" + " 35 " + "|" + " 36 " + "|" + " 37 " + "|" + " 38 " + "|" + " 39 ");
        System.out.println(" 40 " + "|" + " 41 " + "|" + " 42 " + "|" + " 43 " + "|" + " 44 " + "|" + " 45 " + "|" + " 46 " + "|" + " 47 " + "|" + " 48 " + "|" + " 49 ");
        System.out.println(" 50 " + "|" + " 51 " + "|" + " 52 " + "|" + " 53 " + "|" + " 54 " + "|" + " 55 " + "|" + " 56 " + "|" + " 57 " + "|" + " 58 " + "|" + " 59 ");
        System.out.println(" 60 " + "|" + " 61 " + "|" + " 62 " + "|" + " 63 " + "|" + " 64 " + "|" + " 65 " + "|" + " 66 " + "|" + " 67 " + "|" + " 68 " + "|" + " 69 ");
        System.out.println(" 70 " + "|" + " 71 " + "|" + " 72 " + "|" + " 73 " + "|" + " 74 " + "|" + " 75 " + "|" + " 76 " + "|" + " 77 " + "|" + " 78 " + "|" + " 79 ");
        System.out.println(" 80 " + "|" + " 81 " + "|" + " 82 " + "|" + " 83 " + "|" + " 84 " + "|" + " 85 " + "|" + " 86 " + "|" + " 87 " + "|" + " 88 " + "|" + " 89 ");
        System.out.println(" 90 " + "|" + " 91 " + "|" + " 92 " + "|" + " 93 " + "|" + " 94 " + "|" + " 95 " + "|" + " 96 " + "|" + " 97 " + "|" + " 98 " + "|" + " 99 ");

    }

    public void askForChar() {
        System.out.println("Player, choose your mark - X or O?");
    }

    public void askForNextMove(Character c) {
        System.out.println(c + ", what is your next move?");
    }

    public void promptPositionNotAvailable() {
        System.out.println("This position is already taken.");
    }

    public void promptInvalidCharacter() {
        System.out.println("Can't accept this, choose between X and O.");
    }

    public void promptProvideValidPosition() {
        System.out.println("Provide valid position.");
    }

    public void promptIncorrectBoardSize() {
        System.out.println("Try again with 3 or 10.");
    }

    public void promptComputersMove() {
        System.out.println("Now computer is making a move.");
    }

    public void declareWinner(Character c) {
        System.out.println(c + ", you are a winner!");
    }

    public void declareDraw() {
        System.out.println("We have a draw.");
    }

    public void promptTooManyAttempts() {
        System.out.println("Too many unsuccessful attempts. Run the game again.");
    }


}