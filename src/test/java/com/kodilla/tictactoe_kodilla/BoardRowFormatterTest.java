package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

class BoardRowFormatterTest {

    @Test
    void shouldCreateLineFor3() {

        //Given
        Board mockBoard = Mockito.mock(Board.class);
        BoardRowFormatter creator = new BoardRowFormatter();
        when(mockBoard.getSize()).thenReturn(3);
        when(mockBoard.getChar(1,0)).thenReturn(Character.X);
        when(mockBoard.getChar(1,1)).thenReturn(Character.O);
        when(mockBoard.getChar(1,2)).thenReturn(Character.SPACE);


        //When
        String actual = creator.formatRow(1, mockBoard);

        //Then
        Assertions.assertEquals(" X | O |  ", actual);

    }

    @Test
    void shouldCreateLineFor10() {

        //Given
        Board mockBoard = Mockito.mock(Board.class);
        BoardRowFormatter creator = new BoardRowFormatter();
        when(mockBoard.getSize()).thenReturn(10);
        when(mockBoard.getChar(1,0)).thenReturn(Character.X);
        when(mockBoard.getChar(1,1)).thenReturn(Character.O);
        when(mockBoard.getChar(1,2)).thenReturn(Character.SPACE);
        when(mockBoard.getChar(1,3)).thenReturn(Character.X);
        when(mockBoard.getChar(1,4)).thenReturn(Character.O);
        when(mockBoard.getChar(1,5)).thenReturn(Character.X);
        when(mockBoard.getChar(1,6)).thenReturn(Character.O);
        when(mockBoard.getChar(1,7)).thenReturn(Character.SPACE);
        when(mockBoard.getChar(1,8)).thenReturn(Character.SPACE);
        when(mockBoard.getChar(1,9)).thenReturn(Character.SPACE);


        //When
        String actual = creator.formatRow(1, mockBoard);

        //Then
        Assertions.assertEquals(" X | O |   | X | O | X | O |   |   |  ", actual);

    }


}