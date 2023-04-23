package com.kodilla.tictactoe_kodilla;

public class Mechanics {
   // keeping moves in order
   // using Scanner class here
   // keeping score valuation and win/draw criteria

   public Board gameBeginning(){
      System.out.println("Hello Player, choose your mark - X or O");
      //foolproof
      Board board = new Board();
      //present the board
      System.out.println("Here is your board with positions where you can put your mark.");
      //print the board
      return board;
   }

   public Board gameRound() {
      Player player = new Player();
      //round order is Player first, computer second (?), methods evoking order depending on that:
      player.moveOfX();
      player.moveOfO();
      /*Criteria:
      IsVertical? Yes -> win, No - check:
      IsHorizontal? Yes -> win, No - check:
      IsDiagonal? Yes -> win, No - check:
      IsFull? Yes -> draw, No - next round.
       */
      return null;
   }
   public boolean isVertical () {
      //if char in all positions in column 1 is the same or 2 or 3
      return true;
   }

   public boolean isHorizontal () {
      //if char in all positions in row A is the same or B or C
      return true;
   }

   public boolean isDiagonal(){
      //if char a1=b2=c3 or a3=b2=c1
      return true;
   }


   public void itsAWin(){
      System.out.println("You won! Congratulations!" + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"
   }

   public void itsADraw(){
      System.out.println("We have a draw." + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"
   }



}
