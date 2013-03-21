package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import clueGame.*;

public class GameSetupTest {
	private static ClueGame newGame;
	
	
	@BeforeClass
	public static void setUp(){
		newGame = new ClueGame();
	}
	
	
	@Test (expected = BadConfigFormatException.class)
	public void testLoadCards() {
		newGame.loadCards();
		
	}
	
	@Test (expected = BadConfigFormatException.class)
	public void testLoadPlayers() {
		newGame.loadPlayers();
		
	}
	
	@Before
	public void dealTheCards(){
		newGame.deal();
	}
	
	@Test
	public void deal1(){ //test all cards are dealt
		
		Assert.assertEquals(0, newGame.deck.size());
	}
	
	@Test
	public void deal2(){
		Assert.assertEquals(newGame.players.get(0).listOfCards.size(), newGame.players.get(3).listOfCards.size(), 1);
		Assert.assertEquals(newGame.players.get(1).listOfCards.size(), newGame.players.get(4).listOfCards.size(), 1);
		Assert.assertEquals(newGame.players.get(2).listOfCards.size(), newGame.players.get(5).listOfCards.size(), 1);
	}
	 
	@Test
	public void deal3 (){ //test no 1 card is not dealt twice
		int count=0;
		Card test = newGame.players.get(0).listOfCards.get(0);
		for(Player p: newGame.players){
			for (Card c: p.listOfCards){
				if (c.equals(test)){
					count++;
				}
			}
			
		}
		
		Assert.assertEquals(1, count);
	}

}
