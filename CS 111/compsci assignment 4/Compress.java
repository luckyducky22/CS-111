public class Compress
{

	public static String compress (String original)
	{


String small = "";
      char test=0;

      int howMany=1;

      for (int x = original.length()-1; x >=0 ; x--)
      {
         if (test == original.charAt(x))
         {
            howMany = howMany + 1;
         }
         else
         {
            small = test+small;
            if(howMany != 1)
            {
               small = howMany+small  ;
            }
            test = original.charAt(x);
            howMany = 1;
         }
      }
     small = test+small;

      if(howMany != 1)
      {
         small = howMany+small;
      }

		return small;









	}
	public static void main(String[] args)
	{
		System.out.println("Enter a string ");
			String word = IO.readString();

	System.out.println(compress(word));


	}



}