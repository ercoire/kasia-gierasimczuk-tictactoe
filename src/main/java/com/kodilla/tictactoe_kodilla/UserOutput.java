package com.kodilla.tictactoe_kodilla;

public class UserOutput {

   //to print out stuff

   public void firstPrintBoard() {

      System.out.println("Here is your board with positions where you can put your mark:");
      printPositions();
   }

   public void printBoard(Board board) {
      System.out.println(" " + board.getChar(0, 0) + " " + "| " + board.getChar(0, 1) + " | " + board.getChar(0, 2));
      System.out.println(" " + board.getChar(1, 0) + " " + "| " + board.getChar(1, 1) + " | " + board.getChar(1, 2));
      System.out.println(" " + board.getChar(2, 0) + " " + "| " + board.getChar(2, 1) + " | " + board.getChar(2, 2));
   }

   public void printPositions() {
      System.out.println(" 11 " + "|" + " 12 " + "|" + " 13 ");
      System.out.println(" 21 " + "|" + " 22 " + "|" + " 33 ");
      System.out.println(" 31 " + "|" + " 32 " + "|" + " 33 ");
   }

   public void askForChar() {
      System.out.println("Player 1, choose your mark - X or O?");
   }

   public void askForNextMove(char c) {
      System.out.println(c + ", what is your next move?");
   }

   public void promptPositionNotAvailable() {
      System.out.println("This position is already taken.");
   }

   public void declareWinner(char c) {
      System.out.println(c + ", you are a winner!");
   }

   public void declareDraw() {
      System.out.println("We have a draw.");
   }
}