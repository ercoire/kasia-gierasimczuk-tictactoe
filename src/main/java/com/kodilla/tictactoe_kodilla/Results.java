package com.kodilla.tictactoe_kodilla;

public class Results {

   //how game ending in interpreted

   public boolean isVertical() {
      //if char in all positions in column 1 is the same or 2 or 3
      return true;
   }

   public boolean isHorizontal() {
      //if char in all positions in row A is the same or B or C
      return true;
   }

   public boolean isDiagonal() {
      //if char a1=b2=c3 or a3=b2=c1
      return true;
   }


   public void itsAWin() {
      System.out.println("You won! Congratulations!" + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"
   }

   public void itsADraw() {
      System.out.println("We have a draw." + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"
   }



}
