public class WordCount
{

	public static int countWords(String original, int minLength)
	{
		String entered = original;
		String[] parts = entered.split(" ");
		int count=0;

		for (int x=0;x<=parts.length-1;x++)
		{
			if (parts[x].length() >= minLength)
				count=count+1;


		}

		return count;


	}

	public static void main(String[] args)
	{
		System.out.println("Enter a sentence: ");
		String sentence = IO.readString();

		System.out.println("Enter a limit ");
		int limit = IO.readInt();

		System.out.println(countWords(sentence,limit));



	}

}