package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ResultVerifierTest {

    //Mockito for moves

    //case1 PASSED
    @Nested
    class TestsFor0WinningInRows {

        @Test
        void should0WinInFirstRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 11, 12, 13
            board.setChar(0, 0, 'O');
            board.setChar(0, 1, 'O');
            board.setChar(0, 2, 'O');

            //When
            int expectedRow1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow1, 2);
        }

        @Test
        void should0WinInSecondRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 21, 22, 23
            board.setChar(1, 0, 'O');
            board.setChar(1, 1, 'O');
            board.setChar(1, 2, 'O');

            //When
            int expectedRow2 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow2, 2);
        }

        @Test
        void should0WinInThirdRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 31, 32, 33
            board.setChar(2, 0, 'O');
            board.setChar(2, 1, 'O');
            board.setChar(2, 2, 'O');

            //When
            int expectedCol3 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, 2);
        }
    }

    //case2 PASSED
    @Nested
    class TestsFor0WinningInColumns {

        @Test
        void should0WinInFirstColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 11, 12, 13
            board.setChar(0, 0, 'O');
            board.setChar(0, 1, 'O');
            board.setChar(0, 2, 'O');
            //When
            int expectedCol1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol1, 2);
        }

        @Test
        void should0WinInSecondColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 21, 22, 23
            board.setChar(1, 0, 'O');
            board.setChar(1, 1, 'O');
            board.setChar(1, 2, 'O');

            //When
            int expectedCol2 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol2, 2);
        }

        @Test
        void should0WinInThirdColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 31, 32, 33
            board.setChar(2, 0, 'O');
            board.setChar(2, 1, 'O');
            board.setChar(2, 2, 'O');

            //When
            int expectedCol3 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, 2);
        }
    }

    //case3 PASSED
    @Nested
    class TestsFor0WinningInDiagonals {

        @Test
        void shouldMakeOWinInTopDiagonal() {

            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 11, 12, 13
            board.setChar(0, 0, 'O');
            board.setChar(1, 1, 'O');
            board.setChar(2, 2, 'O');

            //When
            int expectedDiag1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, 2);
        }

        @Test
        void shouldMakeOWinInBottomDiagonal() {

            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //O in positions 31, 22, 13
            board.setChar(2, 0, 'O');
            board.setChar(1, 1, 'O');
            board.setChar(0, 2, 'O');

            //When
            int expectedDiag1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, 2);
        }

    }

    //case4 PASSED
    @Nested
    class TestsForXWinningInRows {

        @Test
        void shouldXWinInFirstRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 11, 12, 13
            board.setChar(0, 0, 'X');
            board.setChar(0, 1, 'X');
            board.setChar(0, 2, 'X');

            //When
            int expectedRow1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow1, 1);
        }

        @Test
        void shouldXWinInSecondRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 21, 22, 23
            board.setChar(1, 0, 'X');
            board.setChar(1, 1, 'X');
            board.setChar(1, 2, 'X');

            //When
            int expectedRow2 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow2, 1);
        }

        @Test
        void shouldXWinInThirdRow() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 31, 32, 33
            board.setChar(2, 0, 'X');
            board.setChar(2, 1, 'X');
            board.setChar(2, 2, 'X');

            //When
            int expectedCol3 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, 1);
        }
    }

    //case5 PASSED
    @Nested
    class TestsForXWinningInColumns {

        @Test
        void shouldXWinInFirstColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 11, 12, 13
            board.setChar(0, 0, 'X');
            board.setChar(0, 1, 'X');
            board.setChar(0, 2, 'X');
            //When
            int expectedCol1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol1, 1);
        }

        @Test
        void shouldXWinInSecondColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 21, 22, 23
            board.setChar(1, 0, 'X');
            board.setChar(1, 1, 'X');
            board.setChar(1, 2, 'X');

            //When
            int expectedCol2 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol2, 1);
        }

        @Test
        void shouldXWinInThirdColumn() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 31, 32, 33
            board.setChar(2, 0, 'X');
            board.setChar(2, 1, 'X');
            board.setChar(2, 2, 'X');

            //When
            int expectedCol3 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, 1);
        }
    }

    //case6 PASSED
    @Nested
    class TestsForXWinningInDiagonals {

        @Test
        void shouldMakeOWinInTopDiagonal() {

            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 11, 12, 13
            board.setChar(0, 0, 'X');
            board.setChar(1, 1, 'X');
            board.setChar(2, 2, 'X');

            //When
            int expectedDiag1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, 1);
        }

        @Test
        void shouldMakeOWinInBottomDiagonal() {

            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();
            //X in positions 31, 22, 13
            board.setChar(2, 0, 'X');
            board.setChar(1, 1, 'X');
            board.setChar(0, 2, 'X');

            //When
            int expectedDiag1 = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, 1);
        }

    }

    //case7 PASSED
    @Nested
    class TestsForDraw {
        //case7
        @Test
        void shouldResultInDraw() {
            //Given
            Board board = new Board();
            ResultVerifier verifier = new ResultVerifier();

            //Board is full
            //No line has 3 same chars that are not X/O
            board.setChar(0, 0, 'X');
            board.setChar(0, 1, 'O');
            board.setChar(0, 2, 'X');
            board.setChar(1, 0, 'O');
            board.setChar(1, 1, 'X');
            board.setChar(1, 2, 'O');
            board.setChar(2, 0, 'O');
            board.setChar(2, 1, 'X');
            board.setChar(2, 2, 'O');

            //When
            int expected = verifier.getResult(board);

            //Then
            Assertions.assertEquals(expected, 3);

        }
    }

    //case8 throwing exceptions


}