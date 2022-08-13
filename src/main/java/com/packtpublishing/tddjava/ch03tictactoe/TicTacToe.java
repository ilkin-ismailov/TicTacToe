package com.packtpublishing.tddjava.ch03tictactoe;


public class TicTacToe {

    //This is line written for test purposes

    public Character[][] board = {{'\0', '\0','\0'},
            {'\0','\0','\0'},
            {'\0','\0','\0'}};

    private  char lastPlayer = '\0';
    private final static int SIZE = 3;

    public String play(int x ,int y){

        checkAxis(x);
        checkAxis(y);
        lastPlayer = nextPlayer();
        setBox(x,y, lastPlayer);
        if(isWin()){
            return lastPlayer + " is the winner";
        }
        return "No winner";
    }


    private boolean isWin(){
        for(int i=0;i<SIZE; i++){
            if(board[0][i] + board[1][i] + board[2][i] == lastPlayer){
                return true;
            }
        }
        return false;
    }

    private void checkAxis(int axis){
        if(axis < 1 || axis > 3){
            throw new RuntimeException("Axis out of board");
        }
    }


    private void setBox(int x , int y, char lastPlayer){
        if(board[x -1][y -1] != '\0'){
            throw new RuntimeException("OUt of board");
        }else{
            board[x -1][y -1] = lastPlayer;
        }
    }

    public char nextPlayer(){
        if(lastPlayer == 'X'){
            return 'O';
        }
        return 'X';
    }

}
