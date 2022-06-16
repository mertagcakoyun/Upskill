package com.example.s06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TicTacToeTest {
    static TicTacToe game;

    @BeforeAll
    public static void init() {
        game = new TicTacToe();
    }

    @Test()
    void shouldBoardCreated() {
        Assertions.assertEquals("|---|---|---|\n" +
                "| | | |\n" +
                "|---|---|---|\n" +
                "| | | |\n" +
                "|---|---|---|\n" +
                "| | | |\n" +
                "|---|---|---|",game.printBoard());
    }


}