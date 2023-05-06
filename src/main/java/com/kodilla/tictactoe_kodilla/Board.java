package com.kodilla.tictactoe_kodilla;

public class Board {

   private final char[][] board;

   public Board() {
      board = new char[3][3];
      for (int i = 0; i <3; i++) {
         for (int j=0; j<3; j++) {
            board[i][j] = ' ';
         }
      }
   }

   /*indexes:
   [0][0] [0][1] [0][2]
   [1][0] [1][1] [1][2]
   [2][0] [2][1] [2][2]
    */

   public char getChar(int row, int column) {
      //returns mark on a specified position on the board
      return board[row][column];
   }

   public void setChar(int row, int column, char c) {
      board[row][column] = c;
   }

   public boolean isEmpty(int row, int column) {
      return getChar(row, column) == ' ';
   }
}
