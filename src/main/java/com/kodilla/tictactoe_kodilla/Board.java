package com.kodilla.tictactoe_kodilla;

import static com.kodilla.tictactoe_kodilla.Character.*;

public class Board {

   private final Character[][] board;

   public Board() {
      board = new Character[3][3];
      for (int i = 0; i <3; i++) {
         for (int j=0; j<3; j++) {
            board[i][j] = SPACE;
         }
      }
   }

   /*indexes 3x3:
   [0][0] [0][1] [0][2]
   [1][0] [1][1] [1][2]
   [2][0] [2][1] [2][2]
    */


   public Character getChar(int row, int column) {
      //returns mark on a specified position on the board
      return board[row][column];
   }

   public void setChar(int row, int column, Character c) {
      board[row][column] = c;
   }

   public boolean isEmpty(int row, int column) {
      return (getChar(row, column).equals(SPACE));
   }

}
