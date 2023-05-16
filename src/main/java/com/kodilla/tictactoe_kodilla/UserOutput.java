package com.kodilla.tictactoe_kodilla;

public class UserOutput {

   //to print out stuff

   public void firstPrintBoard() {
      System.out.println("Here is your board with positions where you can put your mark:");
      printPositions();
   }

   public void printBoard(Board board, BoardRowFormatter formatter) {
      System.out.println(formatter.formatRow(0, board));
      System.out.println(formatter.formatRow(1, board));
      System.out.println(formatter.formatRow(2, board));
   }

   public void printPositions() {
      System.out.println(" 11 " + "|" + " 12 " + "|" + " 13 ");
      System.out.println(" 21 " + "|" + " 22 " + "|" + " 33 ");
      System.out.println(" 31 " + "|" + " 32 " + "|" + " 33 ");
   }

   public void askForChar() {
      System.out.println("Player, choose your mark - X or O?");
   }

   public void askForNextMove(Character c) {
      System.out.println(c + ", what is your next move?");
   }

   public void promptPositionNotAvailable() {
      System.out.println("This position is already taken.");
   }

   public void promptInvalidCharacter(){
      System.out.println("Can't accept this, choose between X and O.");
   }

   public void promptProvideValidPosition(){
      System.out.println("Provide valid position.");
   }

   public void declareWinner(Character c) {
      System.out.println(c + ", you are a winner!");
   }

   public void declareDraw() {
      System.out.println("We have a draw.");
   }

   public void promptTooManyAttempts(){
      System.out.println("Too many unsuccessful attempts. Run the game again.");
   }



}