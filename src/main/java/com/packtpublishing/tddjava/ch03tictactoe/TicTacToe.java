package com.packtpublishing.tddjava.ch03tictactoe;


public class TicTacToe {


    public Character[][] board = {{'\0', '\0','\0'},
            {'\0','\0','\0'},
            {'\0','\0','\0'}};

    private  char lastPlayer = '\0';

    public void play(int x ,int y){

        checkAxis(x);
        checkAxis(y);
        setBox(x,y);
        lastPlayer = nextPlayer();
    }

    private void checkAxis(int axis){
        if(axis < 1 || axis > 3){
            throw new RuntimeException("Axis out of board");
        }
    }


    private void setBox(int x , int y){
        if(board[x -1][y -1] != '\0'){
            throw new RuntimeException("OUt of board");
        }else{
            board[x -1][y -1] = 'X';
        }
    }

    public char nextPlayer(){
        if(lastPlayer == 'X'){
            return 'O';
        }
        return 'X';
    }

}
