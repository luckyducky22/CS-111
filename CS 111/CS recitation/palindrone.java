public class palindrone
{
	public static void main(String[] args)
	{
		/*System.out.println("Enter a string: ");
		String word= IO.readString();

		int question=0;

		for (int x=1;x<word.length()/2;x++)
		{
			if (word.charAt(x) !=word.charAt(word.length()-x-1))
				question=1;
		}
		if (question==0)
		System.out.println("yes it is a palindrone");
		else
		System.out.println("no");

*/

/*	System.out.println("Enter a string: ");
			String word= IO.readString();
			word=word.toLowerCase();
			int question=0;

			for (int x=0;x<word.length()/2;x++)
			{
				if (word.charAt(x) !=word.charAt(word.length()-x-1))
					question=1;
			}
			if (question==0)
			System.out.println("yes it is a palindrone");
			else
		System.out.println("no");
*/

System.out.println("Enter a string: ");
			String word= IO.readString();
			word=word.replaceAll(" ","");
			int question=0;

			for (int x=0;x<word.length()/2;x++)
			{
				if (word.charAt(x) !=word.charAt(word.length()-x-1))
					question=1;
			}
			if (question==0)
			System.out.println("yes it is a palindrone");
			else
		System.out.println("no");




	}


}