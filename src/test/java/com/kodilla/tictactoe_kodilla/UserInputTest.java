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
    class TestsForSize {
        @Test
        void shouldReturn3WhenGiven3() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("3");

            //When
            int actual = input.selectBoardSize();

            //Then
            verify(mockScanner, Mockito.times(1)).nextLine();
            assertEquals(3, actual);
        }

        @Test
        void shouldReturn10WhenGiven10() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("10");

            //When
            int actual = input.selectBoardSize();

            //Then
            verify(mockScanner, Mockito.times(1)).nextLine();
            assertEquals(10, actual);
        }

        @Test
        void shouldShowMessageForIncorrectSize() throws OutOfAttemptsException {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("aaa", "3");

            //When
            int actual = input.selectBoardSize();

            //Then
            verify(mockOutput, times(1)).promptIncorrectBoardSize();
            verify(mockScanner, times(2)).nextLine();
            assertEquals(3, actual);
        }

        @Test
        void shouldThrowOutOfAttemptsException() {
            //Given
            UserInput input = new UserInput(mockScanner, mockOutput);
            when(mockScanner.nextLine()).thenReturn("99");


            //When-Then
            Assertions.assertThrowsExactly(OutOfAttemptsException.class, input::selectBoardSize);
            verify(mockScanner, times(5)).nextLine();
        }
    }

    @Nested
    class TestsForCoordinates {

        @Nested
        class TestsFor3x3 {

            private static final int SIZE = 3;

            @Test
            void shouldReturnCoordinatesFor00() throws OutOfAttemptsException {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("00");


                //When
                Coordinates actual = input.getMove(SIZE);

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
                Coordinates actual = input.getMove(SIZE);

                //Then
                assertEquals(2, actual.getRow());
                assertEquals(2, actual.getColumn());
            }


            @Test
            void shouldShowMessageForIncorrectPositionInput() throws OutOfAttemptsException {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("44", "25", "22");
                Coordinates move = new Coordinates(2, 2);


                //When
                Coordinates actual = input.getMove(SIZE);

                //Then
                verify(mockOutput, times(3)).promptProvideValidPosition();
                verify(mockScanner, times(3)).nextLine();
                assertEquals(move, actual);


            }

            @Test
            void shouldThrowOutOfAttemptsException() {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("99");


                //When-Then
                Assertions.assertThrowsExactly(OutOfAttemptsException.class, () -> input.getMove(SIZE));
                verify(mockScanner, times(8)).nextLine();
            }
        }

        @Nested
        class TestsFor10x10 {

            private static final int SIZE = 10;

            @Test
            void shouldReturnCoordinatesFor00() throws OutOfAttemptsException {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("00");


                //When
                Coordinates actual = input.getMove(SIZE);

                //Then
                assertEquals(0, actual.getRow());
                assertEquals(0, actual.getColumn());
            }

            @Test
            void shouldReturnCoordinatesFor99() throws OutOfAttemptsException {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("99");

                //When
                Coordinates actual = input.getMove(SIZE);

                //Then
                assertEquals(9, actual.getRow());
                assertEquals(9, actual.getColumn());
            }


            @Test
            void shouldShowMessageForIncorrectPositionInput() throws OutOfAttemptsException {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("aa")
                        .thenReturn("201")
                        .thenReturn("33");
                Coordinates move = new Coordinates(3, 3);


                //When
                Coordinates actual = input.getMove(SIZE);

                //Then
                verify(mockOutput, times(3)).promptProvideValidPosition();
                verify(mockScanner, times(3)).nextLine();
                assertEquals(move, actual);

            }

            @Test
            void shouldThrowOutOfAttemptsException() {
                //Given
                UserInput input = new UserInput(mockScanner, mockOutput);
                when(mockScanner.nextLine()).thenReturn("111");


                //When-Then
                Assertions.assertThrowsExactly(OutOfAttemptsException.class, () -> input.getMove(SIZE));
                verify(mockScanner, times(8)).nextLine();
            }

        }
    }
}
