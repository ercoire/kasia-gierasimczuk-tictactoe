package com.kodilla.tictactoe_kodilla;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultVerifier {

    public static Result getResult(Board board) {
        //check winning condition
        if ((charWinningVertically(board).equals(Character.X)) || (charWinningHorizontally(board).equals(Character.X)) ||
                (charWinningDiagonally(board).equals(Character.X))) {
            return Result.X_WINS;
        } else if ((charWinningVertically(board).equals(Character.O)) || (charWinningHorizontally(board).equals(Character.O)) ||
                (charWinningDiagonally(board).equals(Character.O))) {
            return Result.O_WINS;
        } else if (isFull(board)) {
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
            Character winningCharacter = charWinningInColumn(board, column);
            if (!winningCharacter.equals(Character.SPACE)) {
                return winningCharacter;
            }
        }
        return winningChar;
    }

    private static Character charWinningHorizontally(Board board) {
        Character winningChar = Character.SPACE;
        for (int row = 0; row < board.getSize(); row++) {
            Character winningCharacter = charWinningInRow(board, row);
            if (!winningCharacter.equals(Character.SPACE)) {
                return winningCharacter;
            }
        }
        return winningChar;
    }

    private static Character charWinningInColumn(Board board, int column) {
        int counter = 0;
        Character current = Character.SPACE;
        int winningSizeStreak = winningStreakLength(board);
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
            if (counter == winningSizeStreak) {
                return current;
            }
        }
        return Character.SPACE;
    }

    private static Character charWinningInRow(Board board, int row) {
        int counter = 0;
        Character current = Character.SPACE;
        int winningSizeStreak = winningStreakLength(board);
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
            if (counter == winningSizeStreak) {
                return current;
            }
        }
        return Character.SPACE;
    }

    private static Character charWinningDiagonally(Board board) {
        Set<Character> winningCharacters = Stream.of(
                        leftDownwardDiagonalsWinningChar(board),
                        rightDownwardDiagonalsWinningChar(board),
                        leftUpwardDiagonalsWinningChar(board),
                        rightUpwardDiagonalsWinningChar(board)
                )
                .collect(Collectors.toSet());
        if (winningCharacters.contains(Character.X)) {
            return Character.X;
        } else if (winningCharacters.contains(Character.O)) {
            return Character.O;
        }
        return Character.SPACE;
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
        return Character.SPACE;
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
        return Character.SPACE;
    }

    private static Character leftUpwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = board.getSize() - 1, column = 0; row >= 0 && column < board.getSize(); row--, column++) {
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
        return Character.SPACE;
    }

    private static Character rightUpwardDiagonalsWinningChar(Board board) {
        int counter = 0;
        Character current = Character.SPACE;
        for (int row = board.getSize() - 1, column = 1; row >= 0 && column < board.getSize(); row--, column++) {
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
        return Character.SPACE;
    }

    private static int winningStreakLength(Board board) {
        if (board.getSize() == 3) {
            return 3;
        } else {
            return 5;
        }
    }
}
