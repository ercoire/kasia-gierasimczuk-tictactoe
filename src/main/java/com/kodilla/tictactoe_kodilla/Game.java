package com.kodilla.tictactoe_kodilla;

public class Game {
   // to keep moves in order

  /* keeping score valuation and win/draw criteria
   public Map<Player, Character> assignCharacters() {
      Map<Player, Character> characterMap = new HashMap<>();

      while (true) {
         System.out.println("Hello Player1, choose your mark - x or o.");
         //foolproof


   */

   private ResultVerifier verifier;
   private Board board;
   private UserInput input;
   private UserOutput output;
   private char c;

   public Game() {
      this.verifier = new ResultVerifier();
      this.board = new Board();
      this.input = new UserInput();
      this.output = new UserOutput();
   }

   public void play(){
      //keeps the whole game running

      //welcome message & printing the board with positions
      output.askForChar();
      //choosing character
      char mark1 = input.selectCharacter();
      Player player1 = new Player(mark1);
      Player player2 = new Player(determinePlayer2Char(mark1));
      output.firstPrintBoard(board);
      //making a move
      output.askForNextMove(player1.getMark());
      player1.move(board);
      //verifying result
     // verifier.getResult(board);
      //printing the board
      output.printBoard(board);
      //declaring a winner/a draw/next move
      output.declareDraw();
      output.declareWinner(c);
   }

   private static char determinePlayer2Char(char mark1) {
      if (mark1 == 'x') {
         return 'o';
      } else {
         return 'x';
      }
   }

}

