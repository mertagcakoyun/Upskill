package com.example.s06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    static TicTacToe game;

    @BeforeEach
    void setUp() {
        game = new TicTacToe();
    }

    @Test
    void isInit(){
        String[] expectedBoard = { " ", " ", " " ," ", " ", " " ," ", " ", " "};
        assertEquals(9, game.board.length);
        assertTrue(Arrays.equals(expectedBoard, game.board));
    }

    @Test
    void isCellEmpty(){
        assertEquals(true, game.board[0].isBlank());
    }

    @Test
    void printStartedGame(){
        var expected = "|---|---|---|\n" +
                "|   |   |   |\n" +
                "|---|---|---|\n" +
                "|   |   |   |\n" +
                "|---|---|---|\n" +
                "|   |   |   |\n" +
                "|---|---|---|";
        assertEquals(expected, game.getBoardStatus());
    }

    @Test
    void canPlayable(){
        var expected = "|---|---|---|\n" +
                "| X | X | X |\n" +
                "|---|---|---|\n" +
                "| O |   |   |\n" +
                "|---|---|---|\n" +
                "| O |   |   |\n" +
                "|---|---|---|";
        try {
            game.play(0, 0);
            game.play(1, 0);
            game.play(0, 1);
            game.play(2, 0);
            game.play(0, 2);
        } catch (Exception e){

        }

        assertEquals(expected, game.getBoardStatus());
    }

    @Test
    void isGameOverRowShouldTrue(){
        try{
            game.play(0, 0);
            game.play(1, 0);
            game.play(0, 1);
            game.play(2, 0);
            game.play(0, 2);
        } catch (Exception e){

        }

        assertEquals(true, game.isGameOver());
    }

    @Test
    void isGameOverShouldFalse(){
        try {
            game.play(0, 0);
            game.play(1, 0);
            game.play(0, 1);
            game.play(2, 0);
        } catch (Exception e){

        }

        assertEquals(false, game.isGameOver());
    }

    @Test
    void isGameOverColumnShouldTrue(){
        try{
            game.play(0, 0);
            game.play(0, 2);
            game.play(0, 1);
            game.play(1, 2);
            game.play(1, 1);
            game.play(2, 2);
        } catch (Exception e){

        }

        assertEquals(true, game.isGameOver());
    }

    @Test
    void isGameOverDiagonalShouldTrue(){
        try {
            game.play(0, 0);
            game.play(0, 1);
            game.play(1, 1);
            game.play(2, 1);
            game.play(2, 2);
        } catch (Exception e){

        }

        assertEquals(true, game.isGameOver());
    }

    @Test
    void cellIsNotEmptyException(){
        try {
            game.play(0, 0);
            game.play(0, 0);
        } catch (Exception e){
            assertEquals("the cell is not empty!", e.getMessage());
        }
    }

    @Test
    void drawCase(){
        try {
            game.play(0, 0);
            game.play(0, 1);
            game.play(0, 2);
            game.play(1, 0);
            game.play(1, 1);
            game.play(1, 2);
            game.play(2, 0);
            game.play(2, 1);
            game.play(2, 2);

        } catch (Exception e){

        }

        assertEquals(true, game.isGameOver());
    }

}