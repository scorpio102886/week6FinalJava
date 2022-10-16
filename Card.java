package warGamePackage;



public class Card {
	String name;
	int value;

	//public Card(int value, String suit) {
		

	
	public void describe() {
		System.out.println("Card name: " + name + " "+ " ," +" Card value: " + value);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	


	}//Class
	