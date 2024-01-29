package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {

    //Attributes
    private char[][] board = new char[6][7];
    private char currentPlayer = 'X';

    //Methods
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public void makeMove(int column) {
        for (int i = 6 - 1; i >= 0; i--) {
            if (board[i][column] == 0) {
                board[i][column] = currentPlayer;
                break;
            }
        }
    }

    public char[][] getBoard() {
        return board;
    }

}
