package com.kodilla.tictactoe_kodilla;

import java.util.ArrayList;

import static com.kodilla.tictactoe_kodilla.Character.*;

public class Board {


   private final Character[][] board;
   private final int size;


   public Board(int size) {
      this.size = size;
      board = new Character[this.size][this.size];
      for (int i = 0; i < this.size; i++) {
         for (int j = 0; j< this.size; j++) {
            board[i][j] = SPACE;
         }
      }
   }


   private final ArrayList<Coordinates> positionsTaken = new ArrayList<>();

   public ArrayList<Coordinates> getPositionsTaken() {
      return positionsTaken;
   }


   public int getSize() {
      return size;
   }



   public Character getChar(int row, int column) {
      return board[row][column];
   }

   public void setChar(int row, int column, Character c) {
      board[row][column] = c;
   }

   public boolean isEmpty(int row, int column) {
      return (getChar(row, column).equals(SPACE));
   }

}
