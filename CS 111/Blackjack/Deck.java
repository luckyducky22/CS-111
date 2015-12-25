// This class represents the deck of cards from which cards are dealt to players.
import java.util.Random;

public class Deck
{

	Card[] deck = new Card[52];



	// This constructor builds f deck of 52 cards.
	public Deck()
	{

     int Spot=0;
     for (int f=0;f<4;f++)
     {
     	for(int g=1;g<14;g++)
     	{
			this.deck[Spot]=new Card(f,g);
			if (Spot<51)
			Spot++;
		}

	}


	}


	// This method takes the top card off the deck and returns it.
	public Card deal()
	{

		return deck[0];
	}



	// this method returns true if there are no more cards to deal, false otherwise
	public boolean isEmpty()
	{
		if (deck[0] ==null)
		{
		return true;
	}

	else return false;
		//fill this method in
	}

	//this method puts the deck int some random order



	public void shuffle(){
		int newNumber =0;
		Card held= null;
		Random randomGenerator= new Random();
		for (int i=0;i<52;i++)
		{
			newNumber = (int)( 52 * Math.random() ) ;
			held=deck[i];
			deck[i]=deck[newNumber];
			deck[newNumber]=held;



		}
	}

}
