package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;


class PlayerTest {

    private static final int SIZE = 10;

    @Test
    void shouldShowMessageForPositionAlreadyTaken() throws OutOfAttemptsException {

        //Given
        Board boardMock = Mockito.mock(Board.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(boardMock.getSize()).thenReturn(SIZE);
        when(inputMock.getMove(SIZE)).thenReturn(new Coordinates(0, 0)).thenReturn(new Coordinates(1, 1));
        when(boardMock.isEmpty(0, 0)).thenReturn(false);
        when(boardMock.isEmpty(1, 1)).thenReturn(true);

        //When
        player.move(boardMock);

        //Then
        Mockito.verify(outputMock, times(1)).promptPositionNotAvailable();
    }


    @Test
    void shouldThrowExceptionForTooManyAttempts() throws OutOfAttemptsException {

        //Given
        Board boardMock = Mockito.mock(Board.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(boardMock.getSize()).thenReturn(SIZE);
        when(inputMock.getMove(SIZE)).thenReturn(new Coordinates(1, 1));
        when(boardMock.isEmpty(1, 1)).thenReturn(false);

        //When-Then
        Assertions.assertThrows(OutOfAttemptsException.class, () -> player.move(boardMock));
        Mockito.verify(inputMock, times(4)).getMove(SIZE);
    }


    @Test
    void shouldUseCoordinatesFromComputerToMakeAValidMove() {
        //Given
        Board boardMock = Mockito.mock(Board.class);
        ComputerInput computerInputMock = Mockito.mock(ComputerInput.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(computerInputMock.computerPicksPosition(boardMock)).thenReturn(new Coordinates(0, 1),
                new Coordinates(1, 0),
                new Coordinates(2, 2));
        when(boardMock.isEmpty(0, 1)).thenReturn(false);
        when(boardMock.isEmpty(1, 0)).thenReturn(false);
        when(boardMock.isEmpty(2, 2)).thenReturn(true);

        //When
        player.randomMove(boardMock, computerInputMock);

        //Then
        Mockito.verify(computerInputMock, times(3)).computerPicksPosition(boardMock);
        Mockito.verify(boardMock, times(1)).setChar(2, 2, Character.O);
    }

    @Test
    void shouldUseCoordinatesFromUserToMakeAValidMove() throws OutOfAttemptsException {

        //Given
        Board boardMock = Mockito.mock(Board.class);
        UserOutput outputMock = Mockito.mock(UserOutput.class);
        UserInput inputMock = Mockito.mock(UserInput.class);
        Player player = new Player(Character.O, inputMock, outputMock);

        when(boardMock.getSize()).thenReturn(SIZE);
        when(inputMock.getMove(SIZE)).thenReturn(new Coordinates(0, 1),
                new Coordinates(1, 0),
                new Coordinates(2, 2));
        when(boardMock.isEmpty(0, 1)).thenReturn(false);
        when(boardMock.isEmpty(1, 0)).thenReturn(false);
        when(boardMock.isEmpty(2, 2)).thenReturn(true);

        //When
        player.move(boardMock);

        //Then
        Mockito.verify(inputMock, times(3)).getMove(SIZE);
        Mockito.verify(boardMock, times(1)).setChar(2, 2, Character.O);
    }
}