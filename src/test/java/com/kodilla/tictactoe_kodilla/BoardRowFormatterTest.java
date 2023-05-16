package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class BoardRowFormatterTest {

    @Test
    void shouldCreateLine() {

        //Given
        Board board = new Board();
        BoardRowFormatter creator = Mockito.spy(new BoardRowFormatter());


        //When
        creator.formatRow(1, board);

        //Then
        verify(creator, Mockito.times(1)).formatRow(1, board);
        //   assertEquals("   |   |   ", System.out.toString());
    }


}