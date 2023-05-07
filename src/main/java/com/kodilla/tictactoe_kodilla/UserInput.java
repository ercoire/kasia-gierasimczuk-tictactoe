package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class UserInput {

   private final Scanner scanner = new Scanner(System.in);

   public char selectCharacter() {

      char charPlayer1;
      //check if string length = 1
      while (true) {
         String temp = scanner.nextLine().toUpperCase();
         if (temp.length() == 1) {
            //convert to char
            charPlayer1 = temp.charAt(0);
            //check if x/o
            if (charPlayer1 == 'O' || charPlayer1 == 'X') {
               return charPlayer1;
            }
         }
         System.out.println("Can't accept this, choose between X and O.");
      }
   }

   public Coordinates getMove() {
      while (true) {
         String temp = scanner.nextLine();
         try {
            int tempInt = Integer.parseInt(temp);
            int column = tempInt % 10;
            int row = tempInt / 10;
            if (row <= 3 && row >= 1 && column <= 3 && column >= 1) {
               row--;
               column--;
               return new Coordinates(row, column);
            }
         } catch (NumberFormatException ignored) {
            //empty
         }
         System.out.println("Try again with valid position.");
      }
   }
}
