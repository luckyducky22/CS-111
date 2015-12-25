public class PigLatin
{


	public static String translate (String original)
	{
		String change =original.toLowerCase();

		if ((change.charAt(0) == 'a') || (change.charAt(0) == 'e') || (change.charAt(0) == 'o') || (change.charAt(0) == 'i') || (change.charAt(0) == 'u'))
			return (change+"way");
		else
			{
				return (change.substring(1) + change.charAt(0) +"ay");


			}


	}




	public static void main(String[] args)
	{
	System.out.println("Enter a word to translate into pig latin: ");
	String word = IO.readString();

	System.out.println(translate(word));




	}




}