package warGamePackage;

import java.util.List;

public class App {

	public static void main(String[] args) {
	Deck deck = new Deck();
	deck.shuffle();
	
	Player player1 = new Player("Player1");
	
	Player player2 = new Player("Player2");
	
	for (int i=0; i<52;i++) {
		if (i%2==0) {
			player1.hand.add(deck.draw());//List<Card>cards
		}	else {
			player2.hand.add(deck.draw());//List<Card>cards
		}
	}
	Card topCardPlayer1 = new Card();
	Card topCardPlayer2 = new Card();
	
	player1.describe();
	player2.describe();
	for (int round = 0; round <26; round++) {
		topCardPlayer1 = player1.flip(player1.hand);
		topCardPlayer2 = player2.flip(player2.hand);
		
		if(topCardPlayer1.getValue() > topCardPlayer2.getValue()) {
			player1.incrementScore();
			System.out.println("Player1 wins the round and gets a point");
			}   else if(topCardPlayer1.getValue() < topCardPlayer2.getValue()) {
				player2.incrementScore();
				System.out.println("Player2 wins the round and gets a point");
			}	else {
				System.out.println("DRAW!");
			}	
	}
	if(player1.score>player2.score) {
		System.out.println("Player 1 WINS!!!!!!");
	} 	else if  (player1.score<player2.score) {
		System.out.println("Player 2 WINS!!!!!!");
	}	else {
		System.out.println("DRAW...");
	}
	}//Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**Main Method**
}//Class
