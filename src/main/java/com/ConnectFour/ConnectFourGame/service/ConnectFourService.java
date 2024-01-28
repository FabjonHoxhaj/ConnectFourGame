package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {

    //Attributes
    private int currentPlayer = 1;

    //Methods
    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    public void makeMove(int column) {

    }

}
