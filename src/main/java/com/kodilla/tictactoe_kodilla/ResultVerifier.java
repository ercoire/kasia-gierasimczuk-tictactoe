package com.kodilla.tictactoe_kodilla;

public class ResultVerifier {


    public int getResult(Board board) {
        //check winner condition
        if (isFull(board)) {
            return 3;   //draw
        } else if (isHorizontal(board)) {
            char winningRowChar = checkWinningRowChar(board);
            if (winningRowChar == 'X') {
                return 1;
            } else if (winningRowChar == 'O') {
                return 2;
            }
        } else if (isVertical(board)) {
            char winningColumnChar = checkWinningColumnChar(board);
            if (winningColumnChar == 'X') {
                return 1;
            } else if (winningColumnChar == 'O') {
                return 2;
            }
        } else if (isDiagonal(board)) {
            if (board.getChar(1, 1) == 'X') {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 0;
        }
        throw new IllegalStateException();
    }

    // return 0 - the game continues
    // return 1 - winner is X
    // return 2 - winner is O
    // return 3 - call a draw

    private static char checkWinningRowChar(Board board) {
        for (int r = 0; r < 3; r++) {
            char mark = board.getChar(r, 0);
            if (board.getChar(r, 1) == mark && board.getChar(r, 2) == mark) {
                return mark;
            }
        }
        return '*';
    }

    private static char checkWinningColumnChar(Board board) {
        for (int c = 0; c < 3; c++) {
            char mark = board.getChar(0, c);
            if (board.getChar(1, c) == mark && board.getChar(2, c) == mark) {
                return mark;
            }
        }
        return '*';
    }


    private boolean areCharactersEqual(char a, char b, char c) {
        return a == b && a == c && a != ' ';
    }

    private boolean isVertical(Board board) {
        //if char in all positions in column 1 is the same or 2 or 3
        return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 0), board.getChar(2, 0)) ||
                areCharactersEqual(board.getChar(0, 1), board.getChar(1, 1), board.getChar(2, 1)) ||
                areCharactersEqual(board.getChar(0, 2), board.getChar(1, 2), board.getChar(2, 2));
    }

    private boolean isHorizontal(Board board) {

        //if char in all positions in row 1 is the same or 2 or 3
        return areCharactersEqual(board.getChar(0, 0), board.getChar(0, 1), board.getChar(0, 2)) ||
                areCharactersEqual(board.getChar(1, 0), board.getChar(1, 1), board.getChar(1, 2)) ||
                areCharactersEqual(board.getChar(2, 0), board.getChar(2, 1), board.getChar(2, 2));
    }

    private boolean isDiagonal(Board board) {
        //if char 11=22=33 or 31=22=11
        return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 1), board.getChar(2, 2)) ||
                areCharactersEqual(board.getChar(2, 0), board.getChar(1, 1), board.getChar(0, 2));
    }

    private boolean isFull(Board board) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board.getChar(r, c) == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


}
