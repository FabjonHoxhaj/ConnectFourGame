package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {

    //Attributes
    private char[][] board = new char[6][7];
    private char currentPlayer = 'X';
    private boolean invalidMove = false;

    //Methods
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

    public void makeMove(int column) {
        if(board[0][column-1] != 0) {
            this.invalidMove = true;
        }
        for (int i = 6 - 1; i >=0; i--) {
            if (board[i][column-1] == 0) {
                board[i][column-1] = currentPlayer;
                this.invalidMove = false;
                break;
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean getInvalidMove() {
        return this.invalidMove;
    }
}
