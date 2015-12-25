
public class TwoSmallest {

	public static void main(String[] args){
		System.out.println("Please enter the terminal value of the sequence: ");
		double terminal = IO.readDouble();
		double set = 0;
		double small1 = 0;
		double small2 = 0;
		int pace=0;
		do{
			pace++;

			System.out.print("Please enter the numbers of the set: ");
			set = IO.readDouble();
			if(pace == 1){
				small1=set;
			}
			if(pace == 2){
				small2=set;
			}
			if(set<small1){
				small2=small1;
				small1=set;
			}

			}
		while(set != terminal);

		System.out.println("The smallest number in the set is: ");
		IO.outputDoubleAnswer(small1);
		System.out.println();

		System.out.println("The second smallest is: ");
		IO.outputDoubleAnswer(small2);
	}

}
