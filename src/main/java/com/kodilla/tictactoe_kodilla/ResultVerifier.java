package com.kodilla.tictactoe_kodilla;

public class ResultVerifier {

   public int getResult(Board b) {
      // return 0 - the game continues
      // return 1 - winner is X
      // return 2 - winner is O
      // return 3 - call a draw
      return 0;
      }


   //how game ending is interpreted

//   public boolean isWinner(Board board) {
//      if (isVertical(board)) {
//         itsAWin();
//      } else if (isHorizontal(board)) {
//         itsAWin();
//      } else if (isDiagonal(board)) {
//         itsAWin();
//      } else {
//         itsADraw();
//      }
//      //next round
//      return false;
//}
//
   private boolean areCharactersEqual(char a, char b, char c) {
      return a == b && a == c;
   }

   private boolean isVertical(Board board) {
      //if char in all positions in column 1 is the same or 2 or 3
      return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 0), board.getChar(2, 0)) ||
            areCharactersEqual(board.getChar(0, 1), board.getChar(1, 1), board.getChar(2, 1)) ||
            areCharactersEqual(board.getChar(0, 2), board.getChar(1, 2), board.getChar(2, 2));
   }

   private boolean isHorizontal(Board board) {
      //if char in all positions in row A is the same or B or C
      return areCharactersEqual(board.getChar(0, 0), board.getChar(0, 1), board.getChar(0, 2)) ||
            areCharactersEqual(board.getChar(1, 0), board.getChar(1, 1), board.getChar(1, 2)) ||
            areCharactersEqual(board.getChar(2, 0), board.getChar(2, 1), board.getChar(2, 2));
   }

   private boolean isDiagonal(Board board) {
      //if char a1=b2=c3 or a3=b2=c1
      return areCharactersEqual(board.getChar(0, 0), board.getChar(1, 1), board.getChar(2, 2)) ||
            areCharactersEqual(board.getChar(2, 0), board.getChar(1, 1), board.getChar(0, 2));
   }


   private void itsAWin() {
      System.out.println("You won! Congratulations!" + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"

   }

   private void itsADraw() {
      System.out.println("We have a draw." + '\n' + "Want another game?");
      //check what player wants and reset/begin or print "Thank you for playing"
   }

}
