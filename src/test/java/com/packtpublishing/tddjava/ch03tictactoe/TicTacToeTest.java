package com.packtpublishing.tddjava.ch03tictactoe;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class TicTacToeTest {

    @Rule
    public ExpectedException exception =
            ExpectedException.none();

    private TicTacToe ticTacToe;

    @Before
    public final void before(){
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenXOutsideBoardThenThrowRuntimeException(){

        exception.expect(RuntimeException.class);
        ticTacToe.play(5,2);
    }

    @Test
    public void whenOccupiedThenThrowRuntimeException(){
        ticTacToe.play(2,1);
        exception.expect(RuntimeException.class);
        ticTacToe.play(2,1);
    }

    @Test
    public void givenFirstTurnWhenNextPlayerThenX(){
        assertEquals('X',ticTacToe.nextPlayer());
    }

    @Test
    public void whenPlayThenNoWinner(){
        String actual = ticTacToe.play(1,1);
        assertEquals("No winner", actual);
    }


    @Test
    public void whenPlayAndWholeHorizontalLineThenWinner(){
        ticTacToe.play(1,1);
        ticTacToe.play(1,2);
        ticTacToe.play(3,1);
        ticTacToe.play(2,1);
        ticTacToe.play(2,2);

        String actual = ticTacToe.play(3,1);
        assertEquals("X is winner", actual);
    }







}
