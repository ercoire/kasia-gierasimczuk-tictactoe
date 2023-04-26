package com.kodilla.tictactoe_kodilla;

public class Board {

   private final char row1 = 'a';
   private final char row2 = 'b';
   private final char row3 = 'c';

   private final char col1 = '1';
   private final char col2 = '2';
   private final char col3 = '3';

   // how the board looks like and how moves are represented
   public void drawEmptyBoard() {
      System.out.println("   " + "|" + "   " + "|" + "   ");
      System.out.println("   " + "|" + "   " + "|" + "   ");
      System.out.println("   " + "|" + "   " + "|" + "   ");
   }

   public void drawPositions() {
      System.out.println(" a1 " + "|" + " a2 " + "|" + " a3 ");
      System.out.println(" b1 " + "|" + " b2 " + "|" + " b3 ");
      System.out.println(" c1 " + "|" + " c2 " + "|" + " c3 ");
   }


}
