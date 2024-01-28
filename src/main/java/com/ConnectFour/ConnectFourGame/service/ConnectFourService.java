package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {

    //Attributes
    private int[][] board = new int[6][7];
    private int currentPlayer = 1;

    //Methods
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    public int[][] makeMove(int column) {
        System.out.println(column);
        for (int i = 6 - 1; i >= 0; i--) {
            if (board[i][column] == 0) {
                board[i][column] = currentPlayer;
                break;
            }
        }
        return board;
    }

    public int[][] getBoard() {
        return board;
    }

}
