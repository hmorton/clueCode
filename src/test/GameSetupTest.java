package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


import clueGame.*;

public class GameSetupTest {
	private ClueGame newGame;
	
	
	@BeforeClass
	public void setUp(){
		newGame = new ClueGame();
	}
	
	
	@Test (expected = BadConfigFormatException.class)
	public void testLoadCards() {
		newGame.loadCards();
		
	}

}
