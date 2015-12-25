public class Poly
{
	public static void main(String[] args)
	{
		System.out.println("Enter the first root: ");
		int a= IO.readInt();
		System.out.println("Enter the second root: ");
		int b= IO.readInt();
		System.out.println("Enter the third root: ");
		int c= IO.readInt();

		int degree2= -(a+b+c);
		int degree1= ((a*b)+(a*c)+(c*b));

		int degree0= (-(c*a*b));

		System.out.println("The polynomial is: ");
		System.out.println("x^3 + "+ degree2+"x^2 + "+ degree1+"x + " + degree0);

	}



}