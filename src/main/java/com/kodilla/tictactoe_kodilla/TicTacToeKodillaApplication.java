package com.kodilla.tictactoe_kodilla;


public class TicTacToeKodillaApplication {

   public static void main(String[] args) {
      Game mech = new Game();
      Player player = new Player();

      mech.gameBeginning(player);

   }

   //that would need to create Players, a board and keep the game going
}
