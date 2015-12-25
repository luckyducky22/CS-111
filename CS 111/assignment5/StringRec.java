public class StringRec
{
	// DO NOT DECLARE ANY VARIABLES HERE
	// (you may declare local variables inside methods)

	public static String decompress(String compressedText)
	{

		String current;
	char ch = ' ';




			if(compressedText.length() != 1)
	    	{


				ch = compressedText.charAt(1);

	    	}

if(compressedText.length() == 1)
	        	{

	                return compressedText;

	        	}


	        else if(compressedText.charAt(0) == '0' && compressedText.length() != 2)
	        {

	        	return decompress(compressedText.substring(2));


	        	}

	        else if(compressedText.charAt(0) == '0' && compressedText.length() == 2)
	        {
	        	compressedText = " ";
	        	return compressedText;
	        	}




	        else
	        if(Character.isLetter(ch) == false)
		        {
	        		ch = compressedText.charAt(2);
		   		 	int spot = Integer.parseInt(compressedText.substring(0,2));

		   		 	spot = spot-1;
		   		 	current = Integer.toString(spot);

		                return ch + decompress(current.concat(compressedText.substring(2)));
		        }
	        	 if(Character.isLetter(ch) == true)
	             {
	        		 	int spot = Integer.parseInt(compressedText.substring(0,1));

	        		 	spot = spot-1;

	        		 	current = Integer.toString(spot);

	                     return ch + decompress(current.concat(compressedText.substring(1)));
	             }







	        return compressedText;
	}

	public static void main(String[] args)
		{
			System.out.println("Enter a string ");
				String word = IO.readString();

		System.out.println(decompress(word));


	}












}
