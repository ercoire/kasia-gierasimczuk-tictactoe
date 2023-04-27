package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class Game {
   // keeping moves in order
   // using Scanner class here
   Scanner scan = new Scanner(System.in);

   // keeping score valuation and win/draw criteria

   public Character gameBeginning() {
      System.out.println("Hello Player, choose your mark - x or o");
      //foolproof
      Character charPlayer1;
      String temp = scan.next();
      //check if string length = 1
      if (temp.length() == 1) {
         //convert to char
         charPlayer1 = scan.next().charAt(0);
         //check if x/o
         if (charPlayer1.equals('o')) {
            System.out.println("Your mark is " + charPlayer1);
            return charPlayer1;
         } else if (charPlayer1.equals('x')) {
            System.out.println("Your mark is " + charPlayer1);
            return charPlayer1;
         } else {
            System.out.println("Can't accept this, choose between x and o.");
         }
      } else {
         System.out.println("Can't accept this, choose between x and o.");


      }
      return null;
   }


   public void boardPresentation() {
      Board board = new Board();
      System.out.println("Here is your board with positions where you can put your mark.");
      board.drawPositions();
   }

   public Board gameRound(Player player) {
      //round order is Player first, computer second or Player 1 then Player 2, methods evoking order depending on that:
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


}
