public class Intersect
{
	public static void main(String[] args)
	{
		System.out.println("Enter the constant d: ");
		int d= IO.readInt();
		System.out.println("Enter the constant f ");
		int f= IO.readInt();
		System.out.println("Enter the constant g ");
		int g= IO.readInt();
		System.out.println("Enter the constant m ");
		int m= IO.readInt();
		System.out.println("Enter the constant b ");
		int b= IO.readInt();

		// equation equals: 0 = dx^2 + (f-m)x + (g-b)
		//						a		b		c
		if ((d==0) && (f==m) && (g ==b))
			System.out.println("They are the same line and so there is an infinite number of intersections");

		else if ((f==m) && (d==0))
			System.out.println("They are parallel lines and so there are no intersections");

		else if ((Math.pow(f-m,2))-(4*d*(g-b)) ==0)
		{
		double onerootx = (-(f-m) + Math.sqrt((Math.pow(f-m,2)) - (4*d*(g-b))))/(2*d);
		double onerooty = (d)*(Math.pow(onerootx,2)) + (f*onerootx) +g;
		System.out.println(" There is only 1 intersection and that is at ("+onerootx+","+onerooty+").");
		}


		else
		{

		double root1x = (-(f-m) + Math.sqrt((Math.pow(f-m,2)) - (4*d*(g-b))))/(2*d);
		double root2x = (-(f-m) - Math.sqrt((Math.pow(f-m,2)) - (4*d*(g-b))))/(2*d);
		double root1y = (d)*(Math.pow(root1x,2)) + (f*root1x) +g;
		double root2y = (d)*(Math.pow(root2x,2)) + (f*root2x) +g;
		if (Double.isNaN(root1x))
			System.out.println("There are no intersections");
		else
		{
		System.out.println("root1: "+root1x+ "  root1y: "+root1y);

		System.out.println("root2: "+root2x+ "  root2y: "+root2y);
		}
	}
	}


}