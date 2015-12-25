public class Person
{
	String name;
	Person[] person= new Person[50];


	public static ask()
	{
		System.out.println("How many players will be in the game: ");
			int numPlayers= IO.readInt();


			Person[] person = new Person[numPlayers+1];
			String name=null;
			for (int x=1;x<=numPlayers;x++)
			{
				System.out.print("Name of player "+(x)+": ");
		name= IO.readString();

	}
}


	public  Person(String theName)
	{

		this.name=theName;


	}






	public  String getName()
	{
		return this.name;
	}

}