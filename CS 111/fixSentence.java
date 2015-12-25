public class fixSentence
{
	public static void main(String[] args)
	{
		String original= "  corRect pUNCtuation    is hard, i  tHINk	";


		String[] words = original.split(" ");



		char one = words[1].charAt(0);
		System.out.println(one);

 		for (int x=0;x<=words.length;x++)
 		{

			words[x]= words[x].toLowerCase();


			if (words[x].charAt[x]== " ")
				System.out.printl("DDDD");
 			System.out.println(words[x]);
		}








	}

}
