package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.tictactoe_kodilla.Character.O;
import static com.kodilla.tictactoe_kodilla.Character.X;

class BoardTest {
    //Tests for setChar()

    //PASSED
    @Test
    void shouldReturnCharForExistingPosition() {
        //Given
        Board board = new Board();

        //When
        board.setChar(1, 1, X);
        Character expectedX = board.getChar(1, 1);

        //Then
        Assertions.assertEquals(expectedX, X);
    }


    //case8 for Board PASSED
    @Test
    void shouldThrowExceptionWhenPositionOutOfArray() {
        //Given
        Board board = new Board();

        //When-Then
        Assertions.assertThrowsExactly(ArrayIndexOutOfBoundsException.class, () -> {
            board.setChar(5, 5, O);
        });
    }
}
