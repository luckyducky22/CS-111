public class Scores
{
	public static void main(String[] args)
	{

		System.out.println("Enter the number of judges: ");
		int numOfJudges= IO.readInt();

		for (int x=1;x<=numOfJudges;x++)
		{
			System.out.println("Enter judge "+x+"'s score");
			int judgeScore= IO.readInt();
		}

	}

}