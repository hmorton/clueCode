package clueGame;

import java.util.ArrayList;

public class ClueGame {
	public ArrayList<Card> deck;
	public ArrayList<Player> players;
	//test
	
	public ClueGame(){
		deck = new ArrayList<Card>();
		players = new ArrayList<Player>();
	}
	
	
	public void deal(){
	}
	
	public void loadConfigFiles(){
		
		try {
			loadCards();
			loadPlayers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loadCards() throws BadConfigFormatException{
		
	}
	
	public void loadPlayers() throws BadConfigFormatException{
		
	}
	
	public void selectAnswer(){
	}
	
	public void handleSuggestion(String person,String room,String weapon,Player accusingPerson){
		
	}
	public boolean checkAccusation(Solution solution){
		return false;
	}
}
