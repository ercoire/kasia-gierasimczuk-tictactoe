package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


class PlayerTest {

    //passed
    @Test
    void shouldShowMessageForPositionAlreadyTaken() throws OutOfAttemptsException {
        //Given
        Board boardMock = Mockito.mock(Board.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(inputMock.getMove()).thenReturn(new Coordinates(0,0)).thenReturn(new Coordinates(1,1));
        when(boardMock.isEmpty(0,0)).thenReturn(false);
        when(boardMock.isEmpty(1,1)).thenReturn(true);

        //When
        player.move(boardMock);

        //Then
        Mockito.verify(outputMock, times(1)).promptPositionNotAvailable();
    }

    //passed
    @Test
    void shouldThrowExceptionForTooManyAttempts() throws OutOfAttemptsException {
        //Given
        Board boardMock = Mockito.mock(Board.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(inputMock.getMove()).thenReturn(new Coordinates(1,1));
        when(boardMock.isEmpty(1,1)).thenReturn(false);

        Assertions.assertThrows(OutOfAttemptsException.class, ()->player.move(boardMock));
        Mockito.verify(inputMock, times(4)).getMove();
    }
}