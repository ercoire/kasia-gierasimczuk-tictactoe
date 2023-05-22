package com.kodilla.tictactoe_kodilla;

public class BoardRowFormatter {

    public String formatRow(int row, Board board) {
        StringBuilder formattedRow = new StringBuilder();
        for (int column = 0; column < board.getSize()-1; column++) {
            formattedRow.append(" ").append(board.getChar(row, column).getName()).append(" |");
        }
        formattedRow.append(" ").append(board.getChar(row, board.getSize() - 1).getName());

        return formattedRow.toString();
    }
}
