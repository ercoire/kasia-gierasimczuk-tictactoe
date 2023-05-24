package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.kodilla.tictactoe_kodilla.Character.O;
import static com.kodilla.tictactoe_kodilla.Character.X;

class BoardTest {

    
    @Nested
    class TestsFor3x3 {
        
        private static final int SIZE = 3;

        @Test
        void shouldReturnCharForExistingPosition() {
            //Given
            Board board = new Board(SIZE);

            //When
            board.setChar(1, 1, X);
            Character actualX = board.getChar(1, 1);

            //Then
            Assertions.assertEquals(X, actualX);
        }


        @Test
        void shouldThrowExceptionWhenPositionOutOfArray() {
            
            //Given
            Board board = new Board(SIZE);

            //When-Then
            Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> board.setChar(5, 5, O));
        }
    }

    @Nested
    class TestsFor10x10{
        
        private static final int SIZE = 10;

        @Test
        void shouldReturnCharForExistingPosition() {
            //Given
            Board board = new Board(SIZE);

            //When
            board.setChar(1, 1, X);
            Character actualX = board.getChar(1, 1);

            //Then
            Assertions.assertEquals(X, actualX);
        }


        @Test
        void shouldThrowExceptionWhenPositionOutOfArray() {
            //Given
            Board board = new Board(SIZE);

            //When-Then
            Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> board.setChar(15, 15, O));
        }
    }
}
