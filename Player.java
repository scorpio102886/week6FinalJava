package warGamePackage;

import java.util.ArrayList;
import java.util.List;

public class Player {
	int score;
	String name;
	List<Card> hand = new ArrayList<Card>();
	
	public Player (String name) {
		this.score=0;
		this.name=name;
	}
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getScore() {
		return score;
		}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand=hand;
	}
	
	
	public void describe() {
			System.out.println("Player" +this.name);
			System.out.println(this.name+"score");
			System.out.println("player's hand:");
			for (Card card: hand) {
				card.describe();
			}
			System.out.println();
			}
		
	public Card flip (List<Card>hand) {
		Card topCard = new Card ();
		topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	public void draw (Deck deck) {
		Card newCard = new Card();
			if ((newCard = deck.draw(deck.cards)) !=null) {
				hand.add(newCard);
			}	else {
				System.out.println("The Deck is empty");
			
			}		
	}
	
	public void incrementScore() {
		this.score++;
	}
	
}//Class
