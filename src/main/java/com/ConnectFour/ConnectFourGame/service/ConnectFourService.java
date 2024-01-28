package com.ConnectFour.ConnectFourGame.service;

import org.springframework.stereotype.Service;

@Service
public class ConnectFourService {
    private char[][] field = new char[6][7];
    private boolean playersTurn = true;

    private String currentPlayer = "PLAYER1";


    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void makeTurn(int column) {
        // Hier füge die Logik für den Zug des Spielers hinzu
        // Zum Beispiel das Spielfeld aktualisieren

        // Wechsel den Spieler
        currentPlayer = (currentPlayer.equals("PLAYER1")) ? "PLAYER2" : "PLAYER1";
    }

}
