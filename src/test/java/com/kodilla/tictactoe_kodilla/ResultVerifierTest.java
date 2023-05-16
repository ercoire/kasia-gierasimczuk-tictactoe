package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.kodilla.tictactoe_kodilla.Result.*;

class ResultVerifierTest {

    //case1 PASSED
    @Nested
    class TestsFor0WinningInRows {

        @Test
        void should0WinInFirstRow() {
            //Given
            Board board = new Board();
            
            //O in positions 11, 12, 13
            board.setChar(0, 0, Character.O);
            board.setChar(0, 1, Character.O);
            board.setChar(0, 2, Character.O);

            //When
            Result expectedRow1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow1, O_WINS);
        }

        @Test
        void should0WinInSecondRow() {
            //Given
            Board board = new Board();
             
            //O in positions 21, 22, 23
            board.setChar(1, 0, Character.O);
            board.setChar(1, 1, Character.O);
            board.setChar(1, 2, Character.O);

            //When
            Result expectedRow2 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow2, O_WINS);
        }

        @Test
        void should0WinInThirdRow() {
            //Given
            Board board = new Board();
             
            //O in positions 31, 32, 33
            board.setChar(2, 0, Character.O);
            board.setChar(2, 1, Character.O);
            board.setChar(2, 2, Character.O);

            //When
            Result expectedCol3 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, O_WINS);
        }
    }

    //case2 PASSED
    @Nested
    class TestsFor0WinningInColumns {

        @Test
        void should0WinInFirstColumn() {
            //Given
            Board board = new Board();
            
            //O in positions 11, 12, 13
            board.setChar(0, 0, Character.O);
            board.setChar(0, 1, Character.O);
            board.setChar(0, 2, Character.O);
            //When
            Result expectedCol1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol1, O_WINS);
        }

        @Test
        void should0WinInSecondColumn() {
            //Given
            Board board = new Board();
            
            //O in positions 21, 22, 23
            board.setChar(1, 0, Character.O);
            board.setChar(1, 1, Character.O);
            board.setChar(1, 2, Character.O);

            //When
            Result expectedCol2 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol2, O_WINS);
        }

        @Test
        void should0WinInThirdColumn() {
            //Given
            Board board = new Board();
            
            //O in positions 31, 32, 33
            board.setChar(2, 0, Character.O);
            board.setChar(2, 1, Character.O);
            board.setChar(2, 2, Character.O);

            //When
            Result expectedCol3 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, O_WINS);
        }
    }

    //case3 PASSED
    @Nested
    class TestsFor0WinningInDiagonals {

        @Test
        void shouldMakeOWinInTopDiagonal() {

            //Given
            Board board = new Board();
            
            //O in positions 11, 12, 13
            board.setChar(0, 0, Character.O);
            board.setChar(1, 1, Character.O);
            board.setChar(2, 2, Character.O);

            //When
            Result expectedDiag1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, O_WINS);
        }

        @Test
        void shouldMakeOWinInBottomDiagonal() {

            //Given
            Board board = new Board();
            
            //O in positions 31, 22, 13
            board.setChar(2, 0, Character.O);
            board.setChar(1, 1, Character.O);
            board.setChar(0, 2, Character.O);

            //When
            Result expectedDiag1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, O_WINS);
        }

    }

    //case4 PASSED
    @Nested
    class TestsForXWinningInRows {

        @Test
        void shouldXWinInFirstRow() {
            //Given
            Board board = new Board();
            //X in positions 11, 12, 13
            board.setChar(0, 0, Character.X);
            board.setChar(0, 1, Character.X);
            board.setChar(0, 2, Character.X);

            //When
            Result expectedRow1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow1, X_WINS);
        }

        @Test
        void shouldXWinInSecondRow() {
            //Given
            Board board = new Board();
             
            //X in positions 21, 22, 23
            board.setChar(1, 0, Character.X);
            board.setChar(1, 1, Character.X);
            board.setChar(1, 2, Character.X);

            //When
            Result expectedRow2 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedRow2, X_WINS);
        }

        @Test
        void shouldXWinInThirdRow() {
            //Given
            Board board = new Board();
            //X in positions 31, 32, 33
            board.setChar(2, 0, Character.X);
            board.setChar(2, 1, Character.X);
            board.setChar(2, 2, Character.X);

            //When
            Result expectedCol3 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, X_WINS);
        }
    }

    //case5 PASSED
    @Nested
    class TestsForXWinningInColumns {

        @Test
        void shouldXWinInFirstColumn() {
            //Given
            Board board = new Board();
            //X in positions 11, 12, 13
            board.setChar(0, 0, Character.X);
            board.setChar(0, 1, Character.X);
            board.setChar(0, 2, Character.X);
            //When
            Result expectedCol1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol1, X_WINS);
        }

        @Test
        void shouldXWinInSecondColumn() {
            //Given
            Board board = new Board();
             
            //X in positions 21, 22, 23
            board.setChar(1, 0, Character.X);
            board.setChar(1, 1, Character.X);
            board.setChar(1, 2, Character.X);

            //When
            Result expectedCol2 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol2, X_WINS);
        }

        @Test
        void shouldXWinInThirdColumn() {
            //Given
            Board board = new Board();
            
            //X in positions 31, 32, 33
            board.setChar(2, 0, Character.X);
            board.setChar(2, 1, Character.X);
            board.setChar(2, 2, Character.X);

            //When
            Result expectedCol3 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedCol3, X_WINS);
        }
    }

    //case6 PASSED
    @Nested
    class TestsForXWinningInDiagonals {

        @Test
        void shouldMakeOWinInTopDiagonal() {

            //Given
            Board board = new Board();
             
            //X in positions 11, 12, 13
            board.setChar(0, 0, Character.X);
            board.setChar(1, 1, Character.X);
            board.setChar(2, 2, Character.X);

            //When
            Result expectedDiag1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, X_WINS);
        }

        @Test
        void shouldMakeOWinInBottomDiagonal() {

            //Given
            Board board = new Board();
             
            //X in positions 31, 22, 13
            board.setChar(2, 0, Character.X);
            board.setChar(1, 1, Character.X);
            board.setChar(0, 2, Character.X);

            //When
            Result expectedDiag1 = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expectedDiag1, X_WINS);
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
             

            //Board is full
            //No line has 3 same chars that are not X/O
            board.setChar(0, 0, Character.X);
            board.setChar(0, 1, Character.O);
            board.setChar(0, 2, Character.X);
            board.setChar(1, 0, Character.O);
            board.setChar(1, 1, Character.X);
            board.setChar(1, 2, Character.O);
            board.setChar(2, 0, Character.O);
            board.setChar(2, 1, Character.X);
            board.setChar(2, 2, Character.O);

            //When
            Result expected = ResultVerifier.getResult(board);

            //Then
            Assertions.assertEquals(expected, DRAW);

        }
    }




}

