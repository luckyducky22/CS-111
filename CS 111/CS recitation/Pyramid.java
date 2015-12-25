public class Pyramid
{
	public static void main(String[] args)
	{
		System.out.println("Enter max number of rows: ");
		int max= IO.readInt();

		for (int row =1;row<=max;row++)
		{
			for (int x=1;x<=row;x++)
			{
			System.out.print("*");
			}
		System.out.println();

		}

		for (int row =1; row<=max -1;row++)
				{
					for (int x=1;x<=max-row;x++)
					{
					System.out.print("*");
					}
				System.out.println();

		}



	}

}