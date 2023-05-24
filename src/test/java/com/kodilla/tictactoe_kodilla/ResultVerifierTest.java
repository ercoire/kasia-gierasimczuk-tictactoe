package com.kodilla.tictactoe_kodilla;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.kodilla.tictactoe_kodilla.Result.*;

class ResultVerifierTest {

    @Nested
    class TestsFor3x3 {
        private final static int SIZE = 3;

        @Nested
        class TestsFor0WinningInRows {

            @Test
            void should0WinInFirstRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 11, 12, 13
                board.setChar(0, 0, Character.O);
                board.setChar(0, 1, Character.O);
                board.setChar(0, 2, Character.O);

                //When
                Result actualRow1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow1, O_WINS);
            }

            @Test
            void should0WinInSecondRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 21, 22, 23
                board.setChar(1, 0, Character.O);
                board.setChar(1, 1, Character.O);
                board.setChar(1, 2, Character.O);

                //When
                Result actualRow2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow2, O_WINS);
            }

            @Test
            void should0WinInThirdRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 31, 32, 33
                board.setChar(2, 0, Character.O);
                board.setChar(2, 1, Character.O);
                board.setChar(2, 2, Character.O);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, O_WINS);
            }
        }


        @Nested
        class TestsFor0WinningInColumns {

            @Test
            void should0WinInFirstColumn() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 11, 12, 13
                board.setChar(0, 0, Character.O);
                board.setChar(0, 1, Character.O);
                board.setChar(0, 2, Character.O);
                //When
                Result actualCol1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol1, O_WINS);
            }

            @Test
            void should0WinInSecondColumn() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 21, 22, 23
                board.setChar(1, 0, Character.O);
                board.setChar(1, 1, Character.O);
                board.setChar(1, 2, Character.O);

                //When
                Result actualCol2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol2, O_WINS);
            }

            @Test
            void should0WinInThirdColumn() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 31, 32, 33
                board.setChar(2, 0, Character.O);
                board.setChar(2, 1, Character.O);
                board.setChar(2, 2, Character.O);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, O_WINS);
            }
        }


        @Nested
        class TestsFor0WinningInDiagonals {

            @Test
            void shouldMakeOWinInTopDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //O in positions 11, 12, 13
                board.setChar(0, 0, Character.O);
                board.setChar(1, 1, Character.O);
                board.setChar(2, 2, Character.O);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, O_WINS);
            }

            @Test
            void shouldMakeOWinInBottomDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //O in positions 31, 22, 13
                board.setChar(2, 0, Character.O);
                board.setChar(1, 1, Character.O);
                board.setChar(0, 2, Character.O);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, O_WINS);
            }

        }


        @Nested
        class TestsForXWinningInRows {

            @Test
            void shouldXWinInFirstRow() {
                //Given
                Board board = new Board(SIZE);
                //X in positions 11, 12, 13
                board.setChar(0, 0, Character.X);
                board.setChar(0, 1, Character.X);
                board.setChar(0, 2, Character.X);

                //When
                Result actualRow1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow1, X_WINS);
            }

            @Test
            void shouldXWinInSecondRow() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 21, 22, 23
                board.setChar(1, 0, Character.X);
                board.setChar(1, 1, Character.X);
                board.setChar(1, 2, Character.X);

                //When
                Result actualRow2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow2, X_WINS);
            }

            @Test
            void shouldXWinInThirdRow() {
                //Given
                Board board = new Board(SIZE);
                //X in positions 31, 32, 33
                board.setChar(2, 0, Character.X);
                board.setChar(2, 1, Character.X);
                board.setChar(2, 2, Character.X);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, X_WINS);
            }
        }


        @Nested
        class TestsForXWinningInColumns {

            @Test
            void shouldXWinInFirstColumn() {
                //Given
                Board board = new Board(SIZE);
                //X in positions 11, 12, 13
                board.setChar(0, 0, Character.X);
                board.setChar(0, 1, Character.X);
                board.setChar(0, 2, Character.X);
                //When
                Result actualCol1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol1, X_WINS);
            }

            @Test
            void shouldXWinInSecondColumn() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 21, 22, 23
                board.setChar(1, 0, Character.X);
                board.setChar(1, 1, Character.X);
                board.setChar(1, 2, Character.X);

                //When
                Result actualCol2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol2, X_WINS);
            }

            @Test
            void shouldXWinInThirdColumn() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 31, 32, 33
                board.setChar(2, 0, Character.X);
                board.setChar(2, 1, Character.X);
                board.setChar(2, 2, Character.X);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, X_WINS);
            }
        }


        @Nested
        class TestsForXWinningInDiagonals {

            @Test
            void shouldMakeXWinInTopDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //X in positions 11, 12, 13
                board.setChar(0, 0, Character.X);
                board.setChar(1, 1, Character.X);
                board.setChar(2, 2, Character.X);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, X_WINS);
            }

            @Test
            void shouldMakeXWinInBottomDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //X in positions 31, 22, 13
                board.setChar(2, 0, Character.X);
                board.setChar(1, 1, Character.X);
                board.setChar(0, 2, Character.X);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, X_WINS);
            }

        }


        @Nested
        class TestsForDraw {

            @Test
            void shouldResultInDraw() {
                //Given
                Board board = new Board(SIZE);


                //Board is full of Xs and Os
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
                Result actual = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actual, DRAW);

            }
        }
    }

    @Nested
    class TestsFor10x10 {
        private final static int SIZE = 10;

        @Nested
        class TestsFor0WinningInRows {

            @Test
            void should0WinInFirstRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 00,...,09
                board.setChar(0, 0, Character.O);
                board.setChar(0, 1, Character.O);
                board.setChar(0, 2, Character.O);
                board.setChar(0, 3, Character.O);
                board.setChar(0, 4, Character.O);
                board.setChar(0, 5, Character.O);
                board.setChar(0, 6, Character.O);
                board.setChar(0, 7, Character.O);
                board.setChar(0, 8, Character.O);
                board.setChar(0, 9, Character.O);

                //When
                Result actualRow1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow1, O_WINS);
            }

            @Test
            void should0WinInFifthRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 51,...,59
                board.setChar(5, 0, Character.O);
                board.setChar(5, 1, Character.O);
                board.setChar(5, 2, Character.O);
                board.setChar(5, 3, Character.O);
                board.setChar(5, 4, Character.O);
                board.setChar(5, 5, Character.O);
                board.setChar(5, 6, Character.O);
                board.setChar(5, 7, Character.O);
                board.setChar(5, 8, Character.O);
                board.setChar(5, 9, Character.O);

                //When
                Result actualRow2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow2, O_WINS);
            }

            @Test
            void should0WinInTenthRow() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 91,...,99
                board.setChar(9, 0, Character.O);
                board.setChar(9, 1, Character.O);
                board.setChar(9, 2, Character.O);
                board.setChar(9, 3, Character.O);
                board.setChar(9, 4, Character.O);
                board.setChar(9, 5, Character.O);
                board.setChar(9, 6, Character.O);
                board.setChar(9, 7, Character.O);
                board.setChar(9, 8, Character.O);
                board.setChar(9, 9, Character.O);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, O_WINS);
            }
        }


        @Nested
        class TestsFor0WinningInColumns {

            @Test
            void should0WinInFirstColumn() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 10,...,90
                board.setChar(0, 0, Character.O);
                board.setChar(1, 0, Character.O);
                board.setChar(2, 0, Character.O);
                board.setChar(3, 0, Character.O);
                board.setChar(4, 0, Character.O);
                board.setChar(5, 0, Character.O);
                board.setChar(6, 0, Character.O);
                board.setChar(7, 0, Character.O);
                board.setChar(8, 0, Character.O);
                board.setChar(9, 0, Character.O);

                //When
                Result actualCol1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol1, O_WINS);
            }

            @Test
            void should0WinInFifthColumn() {
                //Given
                Board board = new Board(SIZE);

                //O in positions 04,...,94
                board.setChar(0, 4, Character.O);
                board.setChar(1, 4, Character.O);
                board.setChar(2, 4, Character.O);
                board.setChar(3, 4, Character.O);
                board.setChar(4, 4, Character.O);
                board.setChar(5, 4, Character.O);
                board.setChar(6, 4, Character.O);
                board.setChar(7, 4, Character.O);
                board.setChar(8, 4, Character.O);
                board.setChar(9, 4, Character.O);

                //When
                Result actualCol2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol2, O_WINS);
            }

            @Test
            void should0WinInTenthColumn() {
                //Given
                Board board = new Board(SIZE);


                //O in positions 09,...,99
                board.setChar(0, 9, Character.O);
                board.setChar(1, 9, Character.O);
                board.setChar(2, 9, Character.O);
                board.setChar(3, 9, Character.O);
                board.setChar(4, 9, Character.O);
                board.setChar(5, 9, Character.O);
                board.setChar(6, 9, Character.O);
                board.setChar(7, 9, Character.O);
                board.setChar(8, 9, Character.O);
                board.setChar(9, 9, Character.O);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, O_WINS);
            }
        }


        @Nested
        class TestsFor0WinningInDiagonals {

            @Test
            void shouldMakeOWinInTopDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //O in positions 00,11,...,99
                board.setChar(0, 0, Character.O);
                board.setChar(1, 1, Character.O);
                board.setChar(2, 2, Character.O);
                board.setChar(3, 3, Character.O);
                board.setChar(4, 4, Character.O);
                board.setChar(5, 5, Character.O);
                board.setChar(6, 6, Character.O);
                board.setChar(7, 7, Character.O);
                board.setChar(8, 8, Character.O);
                board.setChar(9, 9, Character.O);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, O_WINS);
            }

            @Test
            void shouldMakeOWinInBottomDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //O in positions 90,81,...,09
                board.setChar(9, 0, Character.O);
                board.setChar(8, 1, Character.O);
                board.setChar(7, 2, Character.O);
                board.setChar(6, 3, Character.O);
                board.setChar(5, 4, Character.O);
                board.setChar(4, 5, Character.O);
                board.setChar(3, 6, Character.O);
                board.setChar(2, 7, Character.O);
                board.setChar(1, 8, Character.O);
                board.setChar(0, 9, Character.O);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, O_WINS);
            }

        }


        @Nested
        class TestsForXWinningInRows {

            @Test
            void shouldXWinInFirstRow() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 00,...,09
                board.setChar(0, 0, Character.X);
                board.setChar(0, 1, Character.X);
                board.setChar(0, 2, Character.X);
                board.setChar(0, 3, Character.X);
                board.setChar(0, 4, Character.X);
                board.setChar(0, 5, Character.X);
                board.setChar(0, 6, Character.X);
                board.setChar(0, 7, Character.X);
                board.setChar(0, 8, Character.X);
                board.setChar(0, 9, Character.X);

                //When
                Result actualRow1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow1, X_WINS);
            }

            @Test
            void shouldXWinInFifthRow() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 51,...,59
                board.setChar(5, 0, Character.X);
                board.setChar(5, 1, Character.X);
                board.setChar(5, 2, Character.X);
                board.setChar(5, 3, Character.X);
                board.setChar(5, 4, Character.X);
                board.setChar(5, 5, Character.X);
                board.setChar(5, 6, Character.X);
                board.setChar(5, 7, Character.X);
                board.setChar(5, 8, Character.X);
                board.setChar(5, 9, Character.X);

                //When
                Result actualRow2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualRow2, X_WINS);
            }

            @Test
            void shouldXWinInTenthRow() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 91,...,99
                board.setChar(9, 0, Character.X);
                board.setChar(9, 1, Character.X);
                board.setChar(9, 2, Character.X);
                board.setChar(9, 3, Character.X);
                board.setChar(9, 4, Character.X);
                board.setChar(9, 5, Character.X);
                board.setChar(9, 6, Character.X);
                board.setChar(9, 7, Character.X);
                board.setChar(9, 8, Character.X);
                board.setChar(9, 9, Character.X);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, X_WINS);
            }
        }


        @Nested
        class TestsForXWinningInColumns {

            @Test
            void shouldXWinInFirstColumn() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 10,...,90
                board.setChar(0, 0, Character.X);
                board.setChar(1, 0, Character.X);
                board.setChar(2, 0, Character.X);
                board.setChar(3, 0, Character.X);
                board.setChar(4, 0, Character.X);
                board.setChar(5, 0, Character.X);
                board.setChar(6, 0, Character.X);
                board.setChar(7, 0, Character.X);
                board.setChar(8, 0, Character.X);
                board.setChar(9, 0, Character.X);

                //When
                Result actualCol1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol1, X_WINS);
            }

            @Test
            void shouldXWinInFifthColumn() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 04,...,94
                board.setChar(0, 4, Character.X);
                board.setChar(1, 4, Character.X);
                board.setChar(2, 4, Character.X);
                board.setChar(3, 4, Character.X);
                board.setChar(4, 4, Character.X);
                board.setChar(5, 4, Character.X);
                board.setChar(6, 4, Character.X);
                board.setChar(7, 4, Character.X);
                board.setChar(8, 4, Character.X);
                board.setChar(9, 4, Character.X);

                //When
                Result actualCol2 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol2, X_WINS);
            }

            @Test
            void shouldXWinInThirdColumn() {
                //Given
                Board board = new Board(SIZE);

                //X in positions 09,...,99
                board.setChar(0, 9, Character.X);
                board.setChar(1, 9, Character.X);
                board.setChar(2, 9, Character.X);
                board.setChar(3, 9, Character.X);
                board.setChar(4, 9, Character.X);
                board.setChar(5, 9, Character.X);
                board.setChar(6, 9, Character.X);
                board.setChar(7, 9, Character.X);
                board.setChar(8, 9, Character.X);
                board.setChar(9, 9, Character.X);

                //When
                Result actualCol3 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualCol3, X_WINS);
            }
        }


        @Nested
        class TestsForXWinningInDiagonals {

            @Test
            void shouldMakeXWinInTopDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //X in positions 00,11,...,99
                board.setChar(0, 0, Character.X);
                board.setChar(1, 1, Character.X);
                board.setChar(2, 2, Character.X);
                board.setChar(3, 3, Character.X);
                board.setChar(4, 4, Character.X);
                board.setChar(5, 5, Character.X);
                board.setChar(6, 6, Character.X);
                board.setChar(7, 7, Character.X);
                board.setChar(8, 8, Character.X);
                board.setChar(9, 9, Character.X);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, X_WINS);
            }

            @Test
            void shouldMakeXWinInBottomDiagonal() {

                //Given
                Board board = new Board(SIZE);

                //X in positions positions 90,81,...,09
                board.setChar(9, 0, Character.X);
                board.setChar(8, 1, Character.X);
                board.setChar(7, 2, Character.X);
                board.setChar(6, 3, Character.X);
                board.setChar(5, 4, Character.X);
                board.setChar(4, 5, Character.X);
                board.setChar(3, 6, Character.X);
                board.setChar(2, 7, Character.X);
                board.setChar(1, 8, Character.X);
                board.setChar(0, 9, Character.X);

                //When
                Result actualDiag1 = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actualDiag1, X_WINS);
            }

        }


        @Nested
        class TestsForDraw {

            @Test
            void shouldResultInDraw() {
                //Given
                Board board = new Board(SIZE);


                //Board is full of Xs and Os
                board.setChar(0, 0, Character.X);
                board.setChar(0, 1, Character.O);
                board.setChar(0, 2, Character.X);
                board.setChar(0, 3, Character.X);
                board.setChar(0, 4, Character.X);
                board.setChar(0, 5, Character.O);
                board.setChar(0, 6, Character.O);
                board.setChar(0, 7, Character.X);
                board.setChar(0, 8, Character.X);
                board.setChar(0, 9, Character.O);

                board.setChar(1, 0, Character.O);
                board.setChar(1, 1, Character.X);
                board.setChar(1, 2, Character.O);
                board.setChar(1, 3, Character.O);
                board.setChar(1, 4, Character.O);
                board.setChar(1, 5, Character.X);
                board.setChar(1, 6, Character.X);
                board.setChar(1, 7, Character.O);
                board.setChar(1, 8, Character.O);
                board.setChar(1, 9, Character.X);

                board.setChar(2, 0, Character.X);
                board.setChar(2, 1, Character.O);
                board.setChar(2, 2, Character.O);
                board.setChar(2, 3, Character.X);
                board.setChar(2, 4, Character.X);
                board.setChar(2, 5, Character.O);
                board.setChar(2, 6, Character.O);
                board.setChar(2, 7, Character.X);
                board.setChar(2, 8, Character.X);
                board.setChar(2, 9, Character.O);

                board.setChar(3, 0, Character.O);
                board.setChar(3, 1, Character.O);
                board.setChar(3, 2, Character.X);
                board.setChar(3, 3, Character.O);
                board.setChar(3, 4, Character.O);
                board.setChar(3, 5, Character.X);
                board.setChar(3, 6, Character.X);
                board.setChar(3, 7, Character.O);
                board.setChar(3, 8, Character.O);
                board.setChar(3, 9, Character.X);

                board.setChar(4, 0, Character.X);
                board.setChar(4, 1, Character.X);
                board.setChar(4, 2, Character.O);
                board.setChar(4, 3, Character.X);
                board.setChar(4, 4, Character.X);
                board.setChar(4, 5, Character.O);
                board.setChar(4, 6, Character.O);
                board.setChar(4, 7, Character.X);
                board.setChar(4, 8, Character.X);
                board.setChar(4, 9, Character.O);

                board.setChar(5, 0, Character.O);
                board.setChar(5, 1, Character.X);
                board.setChar(5, 2, Character.X);
                board.setChar(5, 3, Character.O);
                board.setChar(5, 4, Character.O);
                board.setChar(5, 5, Character.X);
                board.setChar(5, 6, Character.X);
                board.setChar(5, 7, Character.O);
                board.setChar(5, 8, Character.O);
                board.setChar(5, 9, Character.X);

                board.setChar(6, 0, Character.O);
                board.setChar(6, 1, Character.X);
                board.setChar(6, 2, Character.X);
                board.setChar(6, 3, Character.O);
                board.setChar(6, 4, Character.O);
                board.setChar(6, 5, Character.X);
                board.setChar(6, 6, Character.X);
                board.setChar(6, 7, Character.O);
                board.setChar(6, 8, Character.O);
                board.setChar(6, 9, Character.X);

                board.setChar(7, 0, Character.X);
                board.setChar(7, 1, Character.O);
                board.setChar(7, 2, Character.O);
                board.setChar(7, 3, Character.X);
                board.setChar(7, 4, Character.X);
                board.setChar(7, 5, Character.O);
                board.setChar(7, 6, Character.O);
                board.setChar(7, 7, Character.X);
                board.setChar(7, 8, Character.X);
                board.setChar(7, 9, Character.O);

                board.setChar(8, 0, Character.O);
                board.setChar(8, 1, Character.X);
                board.setChar(8, 2, Character.X);
                board.setChar(8, 3, Character.O);
                board.setChar(8, 4, Character.O);
                board.setChar(8, 5, Character.X);
                board.setChar(8, 6, Character.X);
                board.setChar(8, 7, Character.O);
                board.setChar(8, 8, Character.O);
                board.setChar(8, 9, Character.X);

                board.setChar(9, 0, Character.X);
                board.setChar(9, 1, Character.O);
                board.setChar(9, 2, Character.O);
                board.setChar(9, 3, Character.X);
                board.setChar(9, 4, Character.X);
                board.setChar(9, 5, Character.O);
                board.setChar(9, 6, Character.O);
                board.setChar(9, 7, Character.X);
                board.setChar(9, 8, Character.X);
                board.setChar(9, 9, Character.O);


                //When
                Result actual = ResultVerifier.getResult(board);

                //Then
                Assertions.assertEquals(actual, DRAW);

            }
        }
    }
}

