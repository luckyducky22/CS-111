public class smileyFace
{
	public static void main (String[] args)
	{
		System.out.println("Enter a diameter: ");
		int diameter = IO.readInt();
		Picasso.drawCircle(diameter);
		Picasso.moveRight(diameter+12);
		Picasso.moveLeft(diameter);
		Picasso.moveUp(diameter);
		Picasso.moveDown(diameter+12);
		Picasso.drawLineRight(diameter);
		Picasso.drawLineDown(diameter);

	//diameter=3
	}


}