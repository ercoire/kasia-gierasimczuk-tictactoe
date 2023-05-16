package com.kodilla.tictactoe_kodilla;

public class ResultVerifier {


    public static Result getResult(Board board) {
        //check winning condition

        if (isHorizontal(board)) {
            Character winningRowChar = checkWinningRowChar(board);
            if (winningRowChar.equals(Character.X)) {
                return Result.X_WINS;
            } else {
                return Result.O_WINS;
            }
        } else if (isVertical(board)) {
            Character winningColumnChar = checkWinningColumnChar(board);
            if (winningColumnChar.equals(Character.X)) {
                return Result.X_WINS;
            } else {
                return Result.O_WINS;
            }
        } else if (isDiagonal(board)) {
            if (board.getChar(1, 1).equals(Character.X)) {
                return Result.X_WINS;
            } else {
                return Result.O_WINS;
            }
        } else if (isFull(board)) {
            return Result.DRAW;
        } else {
            return Result.GAME_CONTINUES;
        }
    }

    private static boolean isFull(Board board) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board.getChar(r, c).equals(Character.SPACE)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Character checkWinningRowChar(Board board) {
        for (int r = 0; r < 3; r++) {
            Character mark = board.getChar(r, 0);
            if (areCharactersEqual(mark, board.getChar(r, 1), board.getChar(r, 2))) {
                return mark;
            }
        }
        throw new IllegalStateException();
    }

    private static Character checkWinningColumnChar(Board board) {
        for (int c = 0; c < 3; c++) {
            Character mark = board.getChar(0, c);
            if (areCharactersEqual(mark, board.getChar(1, c), board.getChar(2, c))) {
                return mark;
            }
        }
        throw new IllegalStateException();
    }

    private static boolean areCharactersEqual(Character a, Character b, Character c) {
        return a.equals(b) && a.equals(c) && !a.equals(Character.SPACE);
    }

    private static boolean isVertical(Board board) {
        //if char in all positions in column 1 is the same or 2 or 3
        return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 0), board.getChar(2, 0)) ||
                areCharactersEqual(board.getChar(0, 1), board.getChar(1, 1), board.getChar(2, 1)) ||
                areCharactersEqual(board.getChar(0, 2), board.getChar(1, 2), board.getChar(2, 2));
    }

    private static boolean isHorizontal(Board board) {
        //if char in all positions in row 1 is the same or 2 or 3
        return areCharactersEqual(board.getChar(0, 0), board.getChar(0, 1), board.getChar(0, 2)) ||
                areCharactersEqual(board.getChar(1, 0), board.getChar(1, 1), board.getChar(1, 2)) ||
                areCharactersEqual(board.getChar(2, 0), board.getChar(2, 1), board.getChar(2, 2));
    }

    private static boolean isDiagonal(Board board) {
        //11=22=33 or 31=22=11
        return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 1), board.getChar(2, 2)) ||
                areCharactersEqual(board.getChar(2, 0), board.getChar(1, 1), board.getChar(0, 2));
    }


}
