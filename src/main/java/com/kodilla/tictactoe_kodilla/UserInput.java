package com.kodilla.tictactoe_kodilla;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner;
    private final UserOutput output;

    public UserInput(Scanner scanner, UserOutput output) {
        this.scanner = scanner;
        this.output = output;
    }

    public Character selectCharacter() throws OutOfAttemptsException {
        Character charPlayer1 = null;
        String input;
        int counter = 0;
        do {
            output.askForChar();
            input = scanner.nextLine().toUpperCase();
            try {
                charPlayer1 = Character.valueOf(input);
            } catch (IllegalArgumentException e) {
                output.promptInvalidCharacter();
            }
            counter++;
        }
        while ((charPlayer1 == null || !(charPlayer1.equals(Character.O) || charPlayer1.equals(Character.X))) && counter < 4);
        if (counter > 3) {
            throw new OutOfAttemptsException();
        }
        return charPlayer1;
    }

    public Coordinates getMove() throws OutOfAttemptsException {
        int counter = 0;
        String newInput;
        do {
            output.promptProvideValidPosition();
            newInput = scanner.nextLine();
            try {
                return createCoordinatesFrom(newInput);
            } catch (IllegalArgumentException e) {
                counter++;
            }
        }
        while (counter < 5);
        throw new OutOfAttemptsException();
    }

    private static Coordinates createCoordinatesFrom(String newInput) {
        int tempInt = Integer.parseInt(newInput);
        int column = tempInt % 10;
        int row = tempInt / 10;
        row--;
        column--;
        if (Coordinates.areCoordinatesValid(row, column)) {
            return new Coordinates(row, column);
        }
        throw new IllegalArgumentException();
    }


}