package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {
    private char[][] field = new char[6][7];
    private boolean playersTurn = true;
}
