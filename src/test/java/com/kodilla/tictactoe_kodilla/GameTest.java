package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static com.kodilla.tictactoe_kodilla.Character.X;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;


class GameTest {


    @Test
    void shouldDeclareXWinner() throws OutOfAttemptsException {
        //Given

        int size = 3;
        UserInput mockInput = Mockito.mock(UserInput.class);
        Board board = new Board(size);
        ComputerInput mockComputerInput = Mockito.mock(ComputerInput.class);
        UserOutput mockOutput = Mockito.mock(UserOutput.class);
        BoardRowFormatter formatter = Mockito.mock(BoardRowFormatter.class);
        Game game = new Game(mockOutput, mockInput, mockComputerInput, formatter, board);
        when(mockInput.selectCharacter()).thenReturn(Character.X);
        when(mockComputerInput.computerPicksPosition(board)).thenReturn(new Coordinates(1, 0))
                .thenReturn(new Coordinates(1, 1));
        when(mockInput.getMove(size)).thenReturn(new Coordinates(0, 0))
                .thenReturn(new Coordinates(0, 1))
                .thenReturn(new Coordinates(0, 2));


        //When
        game.play();

        //Then
        Mockito.verify(mockOutput, times(1)).declareWinner(X);

    }

}