public class ask
{
	public static void main(String[] args)
	{
		int sum=0;
		int number;
		do

		{
		System.out.println("Enter an integer");
		 number = IO.readInt();

		if (number >0)
			 sum=sum+number;

		}
		while (number>0);

		System.out.println("The sum of the postive integers is: "+sum);

	}



}