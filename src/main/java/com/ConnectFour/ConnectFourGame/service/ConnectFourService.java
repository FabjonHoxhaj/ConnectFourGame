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

        public String getWinner(int column) {
           for(int i = 5; i >= 0; i--) {
                   if(board[i][column-1] == 'X' && board[i-1][column-1] == 'X' && board[i-2][column-1] == 'X' && board[i-3][column-1] == 'X') {
                      System.out.println("Player 1 ist der Gewinner!");
                  } else if (board[i][column-1] == 'O' && board[i-1][column-1] == 'O' && board[i-2][column-1] == 'O' && board[i-3][column-1] == 'O') {
                       System.out.println("Player 2 ist der Gewinner!");
                   }
           }
            return "Kein Gewinner gefunden";
        }

    public void makeMove(int column) {
        if(board[0][column-1] != 0) {
            this.invalidMove = true;
        }
        for (int i = 5; i >= 0; i--) {
            if (board[i][column-1] == 0) {
                board[i][column-1] = currentPlayer;
                this.invalidMove = false;
                break;
            }
        }
        this.getWinner(column);
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean getInvalidMove() {
        return this.invalidMove;
    }
}
