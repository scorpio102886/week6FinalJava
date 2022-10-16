package warGamePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards=new ArrayList<Card>();
	//Card();
	
	public List<Card> getCards(){
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards=cards;
	}
	                          
	
	
	public Deck() {
	deckBuilder(cards);
	
}
//	public void describe() {
//		for (Card card : cards) {
//			card.describe();
//		}
//	}
	public void shuffle() {
		Collections.shuffle(cards);		
		}
	public Card draw() {//List<Card>cards
		Card drawnCard = new Card();
	if(cards.size()==0) {
		System.out.println("No More Cards left");
		return null;
		}
		else {
			drawnCard=cards.get(0);
			cards.remove(0);
			return drawnCard;
		}
	}
	
	
	
	
	private List<Card>createSuits(int value , String suit){
		List<Card> suitList = new ArrayList<Card>();
		for(int i=0;i<4;i++) {
			Card newCard = new Card();
		newCard.setValue(value);	
		if(i==0) {
			newCard.setName(suit+"of Diamonds");
		suitList.add(newCard);	
			}
		else if(i==1) {
			newCard.setName(suit+"of Hearts");
		suitList.add(newCard);	
			}
		else if(i==2) {
			newCard.setName(suit+"of Spades");
		suitList.add(newCard);	
			}
		else if(i==3) {
			newCard.setName(suit+"of Clubs");
		suitList.add(newCard);	
			}
		
			}
		return suitList;		
			}
	
	private void deckBuilder(List<Card>cards) {
		for(int i =2; i < 15; i++) {
			switch (i) {
			case (2):
				cards.addAll(createSuits(i,"Two"));
				break;
			case (3):
				cards.addAll(createSuits(i,"Three"));
				break;
			case (4):
				cards.addAll(createSuits(i,"Four"));
				break;
			case (5):
				cards.addAll(createSuits(i,"Five"));
				break;
			case (6):
				cards.addAll(createSuits(i,"Six"));
				break;
			case (7):
				cards.addAll(createSuits(i,"Seven"));
				break;
			case (8):
				cards.addAll(createSuits(i,"Eight"));
				break;
			case (9):
				cards.addAll(createSuits(i,"Nine"));
				break;	
			case (10):
				cards.addAll(createSuits(i,"Ten"));
				break;
			case (11):
				cards.addAll(createSuits(i,"Jack"));
				break;
			case (12):
				cards.addAll(createSuits(i,"Queen"));
				break;
			case (13):
				cards.addAll(createSuits(i,"King"));
				break;	
			case (14):
				cards.addAll(createSuits(i,"Ace"));
				break;	
			}		
	}
	}
	}