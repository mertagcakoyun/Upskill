package com.example.s06;

import java.util.Arrays;
import java.util.Objects;

public class TicTacToe {
    public String[] board;
    private boolean isPlayerXTurn;

    public TicTacToe(){
        board = new String[]{ " ", " ", " " ," ", " ", " " ," ", " ", " "};
        isPlayerXTurn = true;
    }

    String getBoardStatus() {
        String boardTemplate ="|---|---|---|\n| %s | %s | %s |\n|---|---|---|\n| %s | %s | %s |\n|---|---|---|\n| %s | %s | %s |\n|---|---|---|";
        return String.format(boardTemplate, board);
    }

    public void play(int x, int y) throws Exception {
        var index = 3*x + y;

        if(!board[index].isBlank()){
            throw new Exception("the cell is not empty!");
        }
        if (x>2 || y>2){
            throw new Exception("Input out of bound");
        }

        board[index] = isPlayerXTurn ? "X" : "O";
        switchTurn();
    }

    public void switchTurn(){
        isPlayerXTurn = !isPlayerXTurn;
    }

    public boolean isCellsAreEqual(String cell1, String cell2){
        return !cell1.isBlank() && !cell2.isBlank() && cell1.equals(cell2);
    }

    public boolean isThereAnyMatchOnAnyRow(){
        if((isCellsAreEqual(board[0], board[1])) && (isCellsAreEqual(board[1], board[2]))){
            return true;
        }
        if((isCellsAreEqual(board[3], board[4])) && (isCellsAreEqual(board[4], board[5]))){
            return true;
        }
        if((isCellsAreEqual(board[6], board[7])) && (isCellsAreEqual(board[7], board[8]))){
            return true;
        }

        return false;
    }

    public boolean isThereAnyMatchOnAnyColumn(){
        if((isCellsAreEqual(board[0], board[3])) && (isCellsAreEqual(board[3], board[6]))){
            return true;
        }

        if((isCellsAreEqual(board[1], board[4])) && (isCellsAreEqual(board[4], board[7]))){
            return true;
        }

        if((isCellsAreEqual(board[2], board[5])) && (isCellsAreEqual(board[5], board[8]))){
            return true;
        }

        return false;
    }

    private boolean isThereAnyMatchOnAnyDiagonal() {
        if((isCellsAreEqual(board[0], board[4])) && (isCellsAreEqual(board[4], board[8]))){
            return true;
        }

        if((isCellsAreEqual(board[2], board[4])) && (isCellsAreEqual(board[4], board[6]))){
            return true;
        }

        return false;
    }

    private boolean isAnyCellIsBlank() {
        return Arrays.stream(board).anyMatch((e) -> e.isBlank());
    }

    public boolean isGameOver() {
        if (isThereAnyMatchOnAnyRow()) return true;

        if (isThereAnyMatchOnAnyColumn()) return true;

        if (isThereAnyMatchOnAnyDiagonal()) return true;

        if (!isAnyCellIsBlank()) return true;

        return false;
    }

}
