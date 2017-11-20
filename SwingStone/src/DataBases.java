import java.util.ArrayList;
import java.util.Collections;

public class DataBases {

	public static ArrayList<Cards> sampleDeck1(){
		ArrayList<Cards> deck = new ArrayList<>();
		deck.add(new Minions(2,"raptor",3,2));
		deck.add(new Minions(2,"raptor",3,2));
		deck.add(new Minions(2,"croc",2,3));
		deck.add(new Minions(2,"croc",2,3));
		deck.add(new Minions(4,"yeti",4,5));
		deck.add(new Minions(4,"yeti",4,5));
		deck.add(new Minions(6,"ogre",6,7));
		deck.add(new Minions(6,"ogre",6,7));
		Collections.shuffle(deck);
		return deck;
	}
}
