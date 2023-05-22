package com.kodilla.tictactoe_kodilla;

public class ResultVerifier {


    public static Result getResult(Board board) {
        //check winning condition
        if ((charWinningVertically(board) == Character.X) || (charWinningHorizontally(board) == Character.X) ||
                (isDiagonal(board) == Character.X)) {
            return Result.X_WINS;
        } else if ((charWinningVertically(board) == Character.O) || (charWinningHorizontally(board) == Character.O) ||
                (isDiagonal(board) == Character.O)){
            return Result.O_WINS;
        }
        else if (isFull(board)) {
            return Result.DRAW;
        } else {
            return Result.GAME_CONTINUES;
        }
    }


    private static boolean isFull(Board board) {
        for (int r = 0; r < board.getSize(); r++) {
            for (int c = 0; c < board.getSize(); c++) {
                if (board.getChar(r, c).equals(Character.SPACE)) {
                    return false;
                }
            }
        }
        return true;
    }


    private static Character charWinningVertically(Board board) {
        Character winningChar = Character.SPACE;
        for (int column = 0; column < board.getSize(); column++) {
            if (charWinningInColumn(board, column) != Character.SPACE) {
                 return winningChar;
            }
        }
        return winningChar;
    }

    private static Character charWinningInColumn(Board board, int column) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = 0; row < board.getSize(); row++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {
                return current;
            }
        }
        return current;
    }

    private static Character charWinningHorizontally(Board board) {
        Character winningChar = Character.SPACE;
        for (int row = 0; row < board.getSize(); row++) {
            if (charWinningInRow(board, row) != Character.SPACE) {
                return winningChar;
            }
        }
        return winningChar;
    }

    private static Character charWinningInRow (Board board, int row) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int column = 0; column < board.getSize(); column++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {

                return current;
            }
        }
        return current;
    }


    private static Character isDiagonal(Board board) {
        Character current = Character.SPACE;
        if ((leftDownwardDiagonalsWinningChar(board) != Character.SPACE) || (rightDownwardDiagonalsWinningChar(board) != Character.SPACE)
                || (leftUpwardDiagonalsWinningChar(board)!= Character.SPACE)
                || (rightUpwardDiagonalsWinningChar(board)!= Character.SPACE) ) {
            return current;

        }
        return current;
    }

    private static Character leftDownwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = 0, column = 0; row < board.getSize() && column < board.getSize(); row++, column++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {
                return current;
            }
        }
        return current;
    }

    private static Character rightDownwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = 0, column = 1; row < board.getSize() && column < board.getSize(); row++, column++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {

                return current;
            }
        }
        return current;
    }

    private static Character leftUpwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = board.getSize() - 1, column = 0; row < 0 && column < board.getSize(); row--, column++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {

                return current;
            }
        }
        return current;
    }


    private static Character rightUpwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = board.getSize() - 1, column = 1; row < 0 && column < board.getSize(); row--, column++) {
            if (board.isEmpty(row, column)) {
                counter = 0;
                current = Character.SPACE;
            } else {
                if (current.equals(board.getChar(row, column))) {
                    counter++;
                } else {
                    current = board.getChar(row, column);
                    counter = 1;
                }
            }
            if (counter == winningStreakLength(board)) {

                return current;
            }
        }
        return current;
    }

    private static int winningStreakLength(Board board) {
        if (board.getSize() == 3) {
            return 3;
        } else {
            return 5;
        }
    }
}
