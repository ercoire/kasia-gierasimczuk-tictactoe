package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ComputerInputTest {

    @Test
    void shouldReturnCoordinates() {

        //Given
        Random mockRandom = Mockito.mock(Random.class);
        ComputerInput input = new ComputerInput(mockRandom);
        Board mockBoard = Mockito.mock(Board.class);

        ArrayList<Coordinates> list = new ArrayList<>();
        list.add(new Coordinates(1,1));
        list.add(new Coordinates(0,0));
        list.add(new Coordinates(2,2));
        list.add(new Coordinates(1,0));
        when(mockBoard.getPositionsEmpty()).thenReturn(list);
        when(mockRandom.nextInt(list.size())).thenReturn(2);


        //When
        Coordinates actual = input.computerPicksPosition(mockBoard);

        //Then
        Assertions.assertFalse(list.contains(actual));
        assertEquals(3, list.size());
        assertEquals(2, actual.getRow());
        assertEquals(2, actual.getColumn());
    }

}