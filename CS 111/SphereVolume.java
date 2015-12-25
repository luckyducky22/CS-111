public class SphereVolume
{
	public static void main(String[] args)
	{
		System.out.print("Enter radius: ");
		double radius = IO.readDouble();

		double volume = (4.0/3)*(Math.PI)*(Math.pow(radius,3));
		System.out.println(volume);

	}


}