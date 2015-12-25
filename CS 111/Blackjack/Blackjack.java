public class Blackjack
{
	public int numPlayers;

	public static String suitWords(int x)
	{
		if (x ==0)
			return "SPADES";
		if (x==1)
			return "HEARTS";
		if (x==2)
			return "HEARTS";
		else return "DIAMONDS";

	}

	public static String faceWords(int x)
	{
		if (x==1)
			return "ACE";
		else if(x == 2)
			return "TWO";
		else if(x == 3)
			return "THREE";
		else if(x == 4)
			return "FOUR";
		else if(x == 5)
			return "FIVE";
		else if(x == 6)
			return "SIX";
		else if(x == 7)
			return "SEVEN";
		else if(x == 8)
			return "EIGHT";
		else if(x == 9)
			return "NINE";
		else if(x == 10)
			return "TEN";
		else if(x == 11)
			return "JACK";
		else if(x == 12)
			return "QUEEN";
		else return "KING";

	}

	/*public void printDeck()
	{
		Card current = null;
		for (int i=0;i<52;i++)
			 current = deck[i];
			System.out.println("Card"+i+current.getSuit()+ "face=: "+current.getFace());
	}
	*/


	public static void Play()
	{
		int playAgain;
		System.out.println("You will start out with 100 dollars and each player will have insurance of losing only half");
		System.out.println("Do you want to get hints throughout the game? Enter 1 for yes. Enter 2 for no.");
		int hints = IO.readInt();

		System.out.println("How many players are playing: ");
			int numPlayers= IO.readInt();
			String[] playerName = new String[numPlayers+1];
			for (int x=1;x<=numPlayers;x++)
			{
				System.out.println("Name of player "+(x)+": ");
				playerName[x]=IO.readString();


			}
do {
			System.out.println("What is each players bet ");
			int[] playerBet = new int[numPlayers+1];


			for (int x=1;x<=numPlayers;x++)
				{
					System.out.println("Bet of player "+(x)+": ");
					playerBet[x]=IO.readInt();

				}

			for (int x=1;x<=numPlayers;x++)
				{
					System.out.println(playerName[x] +" made a bet of "+playerBet[x]);
				}

//ASSIGNING CARDS TO COUNTING CARDS SYSTEM

	int oneValue =1;
	int twoValue =1;
	int threeValue = 1;
	int fourValue =1 ;
	int fiveValue =1;
	int sixValue = 1;
	int sevenValue =0;
	int eightValue =0;
	int nineValue=0;
	int tenValue =-1;
	int jackValue =-1;
	int queenValue =-1;
	int kingValue= -1;
	int aceValue=-1;






				Deck deck = new Deck();



		//check first card after deck is shuffled
				int[] cardSumValue = new int[numPlayers+1];
				int response;
				int wentOver;
				int again=0;
				int tempFirstCard=0;
				int suit;
				 int face;
				 int numOfHit;
				 boolean insurance;
				 int split=15;
				 int secondCard;
				 int firstDuplicateCard;
				 int secondDuplicateCard;
				 int splitFirstBet;
				 int splitSecondBet;
				for (int x=1;x<=numPlayers;x++)
				{
					//String response="hit";
					wentOver=again;
					deck.shuffle();

				  suit=deck.deal().getSuit();
				  face = deck.deal().getFace();
				 System.out.println("The first card you get is: "+faceWords(face)+ " of  "+ suitWords(suit)+" with a face value of: "+deck.deal().getValue());
				 tempFirstCard = deck.deal().getValue();
				do
				{

					//response = null;
				deck.shuffle();

				  suit=deck.deal().getSuit();
				  face = deck.deal().getFace();
				//System.out.println();
				//System.out.println();
				System.out.print("The next card you get is: ");
				secondCard = deck.deal().getValue();
				System.out.println(faceWords(face)+ " of  "+ suitWords(suit)+" with a face value of: "+secondCard);
				System.out.println();
				cardSumValue[x]= cardSumValue[x]+deck.deal().getValue()+tempFirstCard;
				tempFirstCard=0;
				System.out.println("Player " +x+ " sum of cards is: " + cardSumValue[x]);
			//ASKING IF USER WOULD LIKE TO SPLIT CARDS IF THEY HAVE TWO OF THE SAME CARD
				if (tempFirstCard == cardSumValue[1])
				{
					System.out.println("Enter 10 if you would like to split. else enter 0.");
					split = IO.readInt();
				}
				if (split ==10)
				{
					firstDuplicateCard =tempFirstCard;
					secondDuplicateCard=secondCard;
					System.out.println("You're first hand is now with cards " +tempFirstCard+" and "+firstDuplicateCard+".");
					System.out.println("You're second hand is now with cards " +secondCard+" and "+secondDuplicateCard+".");
					System.out.println("Enter ur bet for the first hand");
					splitFirstBet= IO.readInt();
					splitSecondBet= IO.readInt();


			}

				if (cardSumValue[x] <= 21)
				{
				 	wentOver = 1;



				//BASIC HINTS PLUS THEIR BASIC STAT PROBABILITIES
				if (hints ==1)
				{
				if (cardSumValue[x] <=11) System.out.println("HINT: You have a 0% chance of busting. You should hit.");
				if (cardSumValue[x] ==12) System.out.println("HINT: You have a 31% chance of busting. You should hit.");
				if (cardSumValue[x] ==13) System.out.println("HINT: You have a 39% chance of busting. You should hit.");
				if (cardSumValue[x] ==14) System.out.println("HINT: You have a 56% chance of busting. You should hit.");
				if (cardSumValue[x] ==15) System.out.println("HINT: You have a 58% chance of busting. You should hit.");
				if (cardSumValue[x] ==16) System.out.println("HINT: You have a 62% chance of busting. You should hit.");
				if (cardSumValue[x] ==17) System.out.println("HINT: You have a 69% chance of busting. You should fold.");
				if (cardSumValue[x] ==18) System.out.println("HINT: You have a 77% chance of busting. You should fold.");
				if (cardSumValue[x] ==19) System.out.println("HINT: You have a 85% chance of busting. You should fold.");
				if (cardSumValue[x] ==20) System.out.println("HINT: You have a 92% chance of busting. You should fold.");
			}

				System.out.println("Enter 1 to hit, 2 to fold, 3 to double down");

				 response = IO.readInt();
			 }
				else
				{wentOver =21;
				System.out.println("PlAYER "+x+" HAS BUSTED. OUT OF THE GAME");
					response =2;
				}
				if (response ==3)
				{
					playerBet[x] = playerBet[x] + playerBet[x];
					System.out.println("You have just doubled down. You're bet has increased now: "+playerBet[x]);
				}

				}
			while  ((wentOver == 1) && (response !=2) && (response !=3));

				if (x != numPlayers)
				System.out.println("It is the next players turn.");


			}
				int dealerCardValue=0;
				System.out.println("It is now the dealers turn");
				deck.shuffle();

						 suit=deck.deal().getSuit();
						 face = deck.deal().getFace();
				 System.out.println("The first card the dealer had turned over is: "+faceWords(face)+ " of  "+ suitWords(suit)+" with a face value of: "+deck.deal().getValue());

					 int tempFirstCard2 = deck.deal().getValue();
					 //THIS IS WHERE INSURANCE IS GIVEN TO THE PLAYERS WHEN DEALERS FIRST CARD IS AN ACE.
					 if (tempFirstCard2 == 1)
					 {
					 	insurance = true;
					 	System.out.println("The players will be getting insurance because the dealer has a first card of an Ace");
					}
					 else
					 {insurance = false;
					 System.out.println("The players will not be getting insurance because the dealer did not get an ACE as his first card");
				 }
				do
				{
				deck.shuffle();

				 suit=deck.deal().getSuit();
				 face = deck.deal().getFace();
				 System.out.println("The next card dealer gets is: "+faceWords(face)+ " of  "+ suitWords(suit)+" with a face value of: "+deck.deal().getValue());
				 dealerCardValue = dealerCardValue+deck.deal().getValue()+tempFirstCard2;
				 tempFirstCard2=0;
				System.out.println("The dealers value is: "+dealerCardValue);
				}
				while (dealerCardValue <17);
				int place=50;

				int playerBalance[] = new int[numPlayers+1];
				for (int x=1;x<playerBalance.length;x++)
					playerBalance[x]=100;

		int dealerWinning = 0;

				if (dealerCardValue >21)
				{
					for (int x = 1; x < numPlayers+1; x++) {
							    if ((cardSumValue[x] <21))
							    {

							      System.out.println("PLAYER "+ x+" WINS");
								playerBalance[x]=playerBalance[x]+playerBet[x];

							    }
							  else if ((cardSumValue[x] >21))
							  {

								  if (insurance == true)
							   playerBalance[x]=playerBalance[x]- (playerBet[x]/2);
							    else playerBalance[x]=playerBalance[x]-playerBet[x];


						   }
				    }
				}



				for (int x = 1; x < numPlayers+1; x++) {
				    if ((cardSumValue[x] > dealerCardValue) && (cardSumValue[x] <21) && (dealerCardValue <21))
				    {
				      System.out.println("PLAYER "+ x+" WINS");
						playerBalance[x]=playerBalance[x]+playerBet[x];

				    }




					else if (cardSumValue[x] == dealerCardValue)
						System.out.println("There is a push(tie) with the dealer");

					else if (( cardSumValue[x] < dealerCardValue) && (dealerCardValue <=21))
					{
					 dealerWinning =1;
					 if (insurance ==true)
					 playerBalance[x]=playerBalance[x]- (playerBet[x]/2);
					 else
					  playerBalance[x]=playerBalance[x]-playerBet[x];
				  }
				 }

				 if (dealerWinning ==1)

				 {
				 System.out.println("THE DEALER WINS");
						 for (int x=2;x<=numPlayers+1;x++)
				 {


				 }
					}



				 for (int x=2;x<=numPlayers+1;x++)
				 {

					System.out.println("The balance of player "+(x-1)+" is "+playerBalance[x-1]);

				 }


		System.out.println("do you want to play BlackJack. 1 for yes. 2 for no");
		 playAgain =IO.readInt();
	 }
while (playAgain ==1);


	}



	public static void main(String[] args)
	{
		Play();



	}


}