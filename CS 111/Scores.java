
public class Scores {


	public static void main(String [] args){
		int judges=0;
		do
		{
		System.out.print("Please enter the number of judges there are:");
		 judges = IO.readInt();
		 if (judges<=2)
		 System.out.println("You cannot have this number of judges. enter again");
}
		while (judges<=2);
		double small = 0.0;
		double large = 0.0;
		double sum=0.0;

		for(int x=1;x<=judges;x++){
			System.out.println("Enter their score: ");
			double score= IO.readDouble();
			if(score<0||score>10){
				IO.reportBadInput();
				x--;

			}
			else{
				if(x == 1){
					small = score;
				}

				if(score>=large){

					large = score;

				}

				if(score <= small){
					small = score;
				}
				sum+=score;
			}


		}
		System.out.print("The smallest score is: " + small+". ");
		System.out.println("The largest score is " + large);

		double avg= (sum-small-large)/(judges-2);

		System.out.println("The average of the scores without the smallest and largest is " + avg);

	}
}
