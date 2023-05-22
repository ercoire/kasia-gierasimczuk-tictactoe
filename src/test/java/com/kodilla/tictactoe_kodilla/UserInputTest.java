package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserInputTest {

    @Mock
    private Scanner mockScanner;
    @Mock
    private UserOutput mockOutput;


    @Nested
    class TestsForCharacter {

        @Test
        void shouldReturnXWhenGivenX() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("X");

            //When
            Character actual = input.selectCharacter();

            //Then
            verify(mockScanner, Mockito.times(1)).nextLine();
            assertEquals(Character.X, actual);
        }


        @Test
        void shouldReturnOWhenGivenO() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("o");

            //When
            Character actual = input.selectCharacter();

            //Then
            verify(mockScanner, Mockito.times(1)).nextLine();
            assertEquals(Character.O, actual);
        }


        @Test
        void shouldShowMessageForIncorrectCharacter() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("aaa", "o");

            //When
            Character actual = input.selectCharacter();

            //Then
            verify(mockOutput, times(1)).promptInvalidCharacter();
            verify(mockScanner, times(2)).nextLine();
            assertEquals(Character.O, actual);
        }
    }

    @Nested
    class TestsForCoordinates {

        @Test
        void shouldReturnCoordinatesFor00() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("00");


            //When
            Coordinates actual = input.getMove(3);

            //Then
            assertEquals(0, actual.getRow());
            assertEquals(0, actual.getColumn());
        }

        @Test
        void shouldReturnCoordinatesFor22() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("22");

            //When
            Coordinates actual = input.getMove(3);

            //Then
            assertEquals(2, actual.getRow());
            assertEquals(2, actual.getColumn());
        }


        @Test
        void shouldShowMessageForIncorrectPositionInput() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("44", "25", "22");
            Coordinates move = new Coordinates(1, 1);


            //When
            Coordinates actual = input.getMove(3);

            //Then
            verify(mockOutput, times(3)).promptProvideValidPosition();
            verify(mockScanner, times(3)).nextLine();
            assertEquals(move, actual);


        }

        @Test
        void shouldThrowOutOfAttemptsException() {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("00");


            //When-Then
            Assertions.assertThrowsExactly(OutOfAttemptsException.class, () -> input.getMove(3));
            verify(mockScanner, times(8)).nextLine();
        }
    }
}
