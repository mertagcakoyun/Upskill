package com.example.s06;

public class TicTacToe {
    static String[] board;

    public TicTacToe() {
        this.board = new String[9];
        printBoard();
    }

    static String printBoard() {
        String boardTemplate ="|---|---|---|\n|%s|%s|%s|\n|---|---|---|\n|%s|%s|%s|\n|---|---|---|\n|%s|%s|%s|\n|---|---|---|";
        return String.format(boardTemplate, board[0],board[1],board[2],board[3],board[4],board[5],board[6],board[7],board[8]);
    }
}
