package clueGame;

public class Card {
	public enum CardType {ROOM,WEAPON,PERSON};
	public String name;
	private CardType cardType;

	
	public CardType getCardType(){
		return null;
	}
	public void setCardType(CardType card){
		this.cardType = card;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String Name){
		this.name=Name;
	}
	public boolean equals(Card other){
		if(this.name.equals(other.name)){
			return true;
		}else{
		return false;
	}
}
}
