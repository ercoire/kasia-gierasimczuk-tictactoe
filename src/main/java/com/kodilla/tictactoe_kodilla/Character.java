package com.kodilla.tictactoe_kodilla;

public enum Character {
    X('X'),
    SPACE(' '),
    O('O');

    private final char name;

    Character(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }


}
