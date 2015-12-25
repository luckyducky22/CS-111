

public class TempConversion
{
	public static void main(String[] args)
	{
		System.out.print("Enter temp in Fahrenheit: ");
		double fahrenheit = IO.readDouble();
		//fahrenheit = 32;
		double celsius= (fahrenheit -32)* (double) 5/9;
		System.out.println(celsius);

	}

}