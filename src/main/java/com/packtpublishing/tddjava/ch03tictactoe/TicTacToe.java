package com.packtpublishing.tddjava.ch03tictactoe;


public class TicTacToe {


    public void play(int x ,int y){

        if(x < 1 || x > 3){
            throw new RuntimeException("X out of board");
        }else if(y < 1 || y > 3){
            throw new RuntimeException("Y out of board");
        }
    }
}
